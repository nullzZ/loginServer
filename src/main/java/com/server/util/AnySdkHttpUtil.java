package com.server.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

import com.server.Config;

/**
 * 
 * @author nullzZ
 *
 */
public class AnySdkHttpUtil {
    public static JSONObject doPost(String url, String reqData) throws Exception {
	String data = "";
	URL dataUrl = new URL(url);
	HttpURLConnection con = (HttpURLConnection) dataUrl.openConnection();
	con.setRequestProperty("User-Agent", Config.USER_AGENT);
	con.setRequestMethod("POST");
	con.setRequestProperty("Proxy-Connection", "Keep-Alive");
	con.setRequestProperty("accept", "*/*");
	con.setRequestProperty("connection", "Keep-Alive");
	con.setConnectTimeout(30000);
	// con.setRequestProperty("Content-type", "application/json"
	// + ";charset=UTF-8");
	con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
	con.setDoOutput(true);
	con.setDoInput(true);
	OutputStream os = con.getOutputStream();
	BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));
	writer.write(reqData);
	writer.flush();

	BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
	String lines;
	StringBuffer sb = new StringBuffer("");
	while ((lines = reader.readLine()) != null) {
	    lines = new String(lines.getBytes(), "utf-8");
	    sb.append(lines);
	}

	data = sb.toString();

	tryClose(reader);
	tryClose(os);

	con.disconnect();
	JSONObject ret = null;
	if (data != null && !data.equals("")) {
	    ret = new JSONObject(data);
	}
	return ret;
    }

    /**
     * 关闭输出流
     * 
     * @param os
     */
    private static void tryClose(OutputStream os) {
	try {
	    if (null != os) {
		os.close();
		os = null;
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    /**
     * 关闭Reader
     * 
     * @param reader
     */
    private static void tryClose(Reader reader) {
	try {
	    if (null != reader) {
		reader.close();
		reader = null;
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}
