package com.server.sdkImpl.anySdk;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.server.ChannelEnum;
import com.server.Config;
import com.server.service.login.ILoginService;
import com.server.util.AnySdkHttpUtil;

/**
 * 
 * @author nullzZ
 *
 */
@Service
public class AnySdkLoginService implements ILoginService {

    @Override
    public boolean checkParameter(HttpServletRequest request) {
	Map<String, String[]> params = request.getParameterMap();
	// 检测必要参数
	if (parametersIsset(params)) {
	    return false;
	}
	return true;
    }

    @Override
    public JSONObject reCallSdk(HttpServletRequest request) {
	try {
	    String queryString = getQueryString(request);
	    JSONObject retJson = AnySdkHttpUtil.doPost(Config.LOGIN_CHECK_URL, queryString);
	    return retJson;
	} catch (Exception e) {
	    return null;
	}

    }

    @Override
    public boolean sendToken2GameServer(long u, String serverID, String channelID, String accessToken) {
	String userId = String.valueOf(u);
	short usernameLength = (short) userId.length();
	short keyLength = (short) Config.KEY.length();
	short valueLength = (short) Config.VALUE.length();
	short tokenLength = (short) accessToken.length();
	// 所占字节数 2：有两个byte 4:2个int 6:4个short
	short totalLength = (short) (2 + keyLength + valueLength + usernameLength + tokenLength + 8 + 8);
	ByteBuffer wbb = ByteBuffer.allocate(totalLength + 2);
	wbb.putShort(totalLength);

	wbb.put((byte) 18);
	wbb.put((byte) 33);
	wbb.putShort(keyLength);
	wbb.put(Config.KEY.getBytes());
	wbb.putShort(valueLength);
	wbb.put(Config.VALUE.getBytes());
	wbb.putShort(usernameLength);
	wbb.put(userId.getBytes());
	wbb.putInt(Integer.parseInt(serverID));
	wbb.putInt(Integer.parseInt(channelID));
	wbb.putShort(tokenLength);
	wbb.put(accessToken.getBytes());

	byte[] oarray = wbb.array();

	Socket socket = null;
	InputStream sInputStream = null;
	OutputStream sOutputStream = null;

	try {
	    String host = Config.getServerHost(ChannelEnum.ANY_SDK.value, channelID, serverID);// 这里必须用channelId+ServerId来区分服务器的唯一
	    if (socket == null)
		socket = new Socket(host, Config.PORT);
	    if (sInputStream == null)
		sInputStream = socket.getInputStream();
	    if (sOutputStream == null)
		sOutputStream = socket.getOutputStream();

	    sOutputStream.write(oarray);
	    return true;

	    // // 等待游戏服务器返回accessToken
	    // int readtime = 100;
	    // boolean hasGetInfo = false;
	    // for (int i = 0; i < readtime; i++) {
	    // int available = sInputStream.available();
	    // if (available != 0) {
	    // hasGetInfo = true;
	    // }
	    //
	    // if (!hasGetInfo)
	    // Thread.sleep(100);
	    // else {
	    // Thread.sleep(50);
	    // }
	    // }
	} catch (Exception e) {
	    return false;
	} finally {
	    try {
		if (null != sInputStream) {
		    sInputStream.close();
		    sInputStream = null;
		}
		if (null != sOutputStream) {
		    sOutputStream.close();
		    sOutputStream = null;
		}
		if (null != socket) {
		    socket.close();
		    socket = null;
		}
	    } catch (IOException e) {
		e.printStackTrace();
		return false;
	    }
	}

	// String host = Config.SERVERS_CONFIG.getString(serverID);
	// String ret = HttpUtil.doPostStr("http://" + host + ":" + Config.PORT,
	// oarray);

    }

    /**
     * check needed parameters isset 检查必须的参数 channel
     * uapi_key：渠道提供给应用的app_id或app_key（标识应用的id）
     * uapi_secret：渠道提供给应用的app_key或app_secret（支付签名使用的密钥）
     * 
     * @param params
     * @return boolean
     */
    private boolean parametersIsset(Map<String, String[]> params) {
	return !(params.containsKey("channel") && params.containsKey("uapi_key") && params.containsKey("uapi_secret"));
    }

    /**
     * 获取查询字符串
     * 
     * @param request
     * @return
     */
    private String getQueryString(HttpServletRequest request) {
	Map<String, String[]> params = request.getParameterMap();
	String queryString = "";
	for (String key : params.keySet()) {
	    String[] values = params.get(key);
	    for (int i = 0; i < values.length; i++) {
		String value = values[i];
		queryString += key + "=" + value + "&";
	    }
	}
	queryString = queryString.substring(0, queryString.length() - 1);
	return queryString;
    }

}
