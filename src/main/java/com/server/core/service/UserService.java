package com.server.core.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.server.ChannelEnum;
import com.server.core.cach.UserCach;
import com.server.core.util.UqIdUtil;
import com.server.db.dao.UserRecordMapper;
import com.server.db.model.UserRecord;
import com.server.db.model.UserRecordExample;

/**
 * 
 * @author nullzZ
 *
 */
@Service
public class UserService implements IUserService {
    private static final Logger logger = Logger.getLogger(UserService.class);
    @Resource
    private UserRecordMapper userRecordMapper;

    @Override
    public boolean insertDB(UserRecord user) {
	return userRecordMapper.insertSelective(user) > 0;
    }

    @Override
    public UserRecord createUser(ChannelEnum channelEnum, String sdk_uid, String channel, String lastServerId,
	    String device, String deviceVersion, String loginIP) {
	UserRecord record = new UserRecord();
	long userId = UqIdUtil.buildUqId();
	record.setUserId(userId);
	record.setSdkCannel(channelEnum.value);
	record.setSdk_uid(sdk_uid);
	record.setChannel(channel);
	record.setLastServerId(lastServerId);
	Date d = new Date();
	record.setCreateTime(d);
	record.setLoginTimestamp(d);
	record.setDevice(device);
	record.setDeviceVersion(deviceVersion);
	record.setLoginIP(loginIP);

	if (this.insertDB(record)) {
	    UserCach.getInstance().put(getUserKey(channelEnum, sdk_uid, channel), record);
	    return record;
	} else {
	    logger.error("创建user失败");
	    return null;
	}

    }

    private String getUserKey(ChannelEnum channelEnum, String sdk_uid, String channel) {
	return channelEnum.value + "_" + channel + "_" + sdk_uid;
    }

    @Override
    public UserRecord getUser(ChannelEnum channelEnum, String sdk_uid, String channel) {
	// 可以加入缓存
	UserRecord record = null;
	record = UserCach.getInstance().get(getUserKey(channelEnum, sdk_uid, channel));
	if (record == null) {
	    record = this.selectUserRecordByDB(channelEnum, sdk_uid, channel);
	}
	return record;
    }

    @Override
    public UserRecord selectUserRecordByDB(ChannelEnum channelEnum, String uid, String channel) {
	UserRecordExample e = new UserRecordExample();
	e.createCriteria().andSdkCannelEqualTo(channelEnum.value).andSdk_uidEqualTo(uid).andChannelEqualTo(channel);
	List<UserRecord> records = userRecordMapper.selectByExample(e);
	if (records.size() > 0) {
	    return records.get(0);
	} else {
	    return null;
	}
    }

    @Override
    public boolean updateUserRecord(UserRecord user) {
	return userRecordMapper.updateByPrimaryKeySelective(user) > 0;
    }

    @Override
    public UserRecord register(ChannelEnum channelEnum, String uid, String serverID, String channelID, String device,
	    String deviceVersion, String loginIP) {
	UserRecord userRecord = this.getUser(channelEnum, uid, channelID);
	if (null == userRecord) {
	    userRecord = this.createUser(channelEnum, uid, channelID, serverID, device, deviceVersion, loginIP);
	    if (null == userRecord) {
		logger.debug("[登陆][注册用户失败]");
		return null;
	    }
	    logger.debug("[登陆][注册用户成功]");
	}
	userRecord.setLastServerId(serverID);
	userRecord.setLoginTimestamp(new Date());
	this.updateUserRecord(userRecord);// 更新登录时间和服务器ID
	return userRecord;
    }

}
