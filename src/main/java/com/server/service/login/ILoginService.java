package com.server.service.login;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;

/**
 * 
 * @author nullzZ
 *
 */
public interface ILoginService {
    /**
     * 检测必要参数
     * 
     * @param request
     */
    public boolean checkParameter(HttpServletRequest request);

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
