package com.server.sdkImpl.anySdk;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.server.ChannelEnum;
import com.server.core.action.ILoginAction;
import com.server.core.service.LoginResult;
import com.server.core.service.UserService;
import com.server.core.util.HttpUtil;

/**
 * 
 * @author nullzZ
 *
 */
@Controller
public class AnySdkLoginAction implements ILoginAction {

    private static final Logger logger = Logger.getLogger(AnySdkLoginAction.class);
    @Resource
    private AnySdkLoginService anySdkLoginService;
    @Resource
    private UserService userService;

    @Override
    @RequestMapping(value = "/anysdk/loginReCall", method = RequestMethod.GET)
    public void sdkCall(HttpServletRequest request, HttpServletResponse response) {
	try {

	    if (!anySdkLoginService.checkParameter(request)) {
		HttpUtil.write(response, "parameter not complete");
		logger.debug("[登陆][fail]parameter not complete");
		return;
	    }

	    JSONObject retJson = anySdkLoginService.reCallSdk(request);
	    if (null == retJson || !"ok".equals(retJson.getString("status"))) {
		HttpUtil.write(response, "Unknown error!");
		logger.debug("[登陆][Unknown error!]" + retJson);
		return;
	    }

	    if (!retJson.has("common")) {
		HttpUtil.write(response, "Unknown error!");
		return;
	    }
	    JSONObject common = retJson.getJSONObject("common");
	    String uid = common.getString("uid"); // 用户id
	    String serverID = common.getString("server_id"); // 服务器ID
	    String channelID = common.getString("channel"); // 渠道ID
	    String device = "";
	    String deviceVersion = "";
	    String loginIP = "";

	    // JSONObject retJson = new JSONObject();
	    // String uid = "11";
	    // String serverID = "18"; // 服务器ID
	    // String channelID = "0"; // 渠道ID

	    LoginResult result = anySdkLoginService.handle(ChannelEnum.ANY_SDK, uid, serverID, channelID, device,
		    deviceVersion, loginIP);
	    if (null == result) {
		HttpUtil.write(response, "Unknown error!");
		return;
	    }
	    retJson.put("ext", String.valueOf(result.getUserId()) + "," + result.getToken());
	    HttpUtil.write(response, retJson);
	    logger.debug("[登陆][ok]" + retJson);
	} catch (Exception e) {
	    HttpUtil.write(response, "Unknown error!");
	    logger.error("[登陆][Unknown error!]", e);
	}
    }

}
