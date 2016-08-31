package com.server.core.service;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;

import com.server.ChannelEnum;

/**
 * 
 * @author nullzZ
 *
 */
public interface ILoginService {

    /**
     * 
     * @param channelEnum
     *            sdk渠道id
     * @param uid
     *            sdk给的uid
     * @param serverID
     *            sdk的ServerId
     * @param channelID
     *            sdk的channel
     * @return
     */
    public LoginResult handle(ChannelEnum channelEnum, String uid, String serverID, String channelID, String device,
	    String deviceVersion, String loginIP);

    /**
     * 回调SDK
     * 
     * @param request
     * @return
     */
    public JSONObject reCallSdk(HttpServletRequest request);

    /**
     * 向游戏服务器发送信息取得accessToken
     * 
     * @param username
     * @param serverID
     * @param channelID
     * @param accessToken
     * @return
     * @throws Exception
     */
    public boolean sendToken2GameServer(long userId, String serverID, String channelID, String accessToken);
}
