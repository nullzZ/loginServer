package com.server.core.service;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.server.ChannelEnum;
import com.server.db.model.UserRecord;
import com.server.util.UniqueID;

/**
 * @author nullzZ
 * 
 */
public abstract class AbsLoginService implements ILoginService {
    @Resource
    private UserService userService;
    private static final Logger logger = Logger.getLogger(AbsLoginService.class);

    public LoginResult handle(ChannelEnum channelEnum, String uid, String serverID, String channelID, String device,
	    String deviceVersion, String loginIP) {
	UserRecord userRecord = userService.register(channelEnum, uid, serverID, channelID, device, deviceVersion,
		loginIP);
	if (null == userRecord) {
	    logger.debug("[登陆][注册用户失败]channelEnum:" + channelEnum.value + "|uid:" + uid + "|serverID:" + serverID
		    + "|channelID:" + channelID);
	    return null;
	}

	UniqueID uniqueId = new UniqueID(Integer.parseInt(serverID));// 生成token
	String accessToken = Long.toString(uniqueId.Get());

	boolean ret = this.sendToken2GameServer(userRecord.getUserId(), serverID, channelID, accessToken);
	if (!ret) {
	    logger.debug("[登陆][发送游戏服务器][异常]channelEnum:" + channelEnum.value + "|uid:" + uid + "|serverID:" + serverID
		    + "|channelID:" + channelID);
	    return null;
	}
	return new LoginResult(userRecord.getUserId(), accessToken);
    }

    // public abstract JSONObject reCallSdk(HttpServletRequest request);

    // public abstract boolean sendToken2GameServer(long userId, String
    // serverID, String channelID, String accessToken);

}
