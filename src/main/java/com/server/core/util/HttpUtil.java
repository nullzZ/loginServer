package com.server.core.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;



public class HttpUtil {
    public static JSONObject doPost(String url, byte[] postData) throws Exception {
	OutputStream os = null;
	BufferedReader reader = null;
	try {
	    String data = "";
	    URL dataUrl = new URL(url);
	    HttpURLConnection con = (HttpURLConnection) dataUrl.openConnection();
	    con.setRequestMethod("POST");
	    con.setRequestProperty("Proxy-Connection", "Keep-Alive");
	    con.setRequestProperty("accept", "*/*");
	    con.setRequestProperty("connection", "Keep-Alive");
	    // con.setRequestProperty("Content-type", "application/json"
	    // + ";charset=UTF-8");
	    con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
	    con.setDoOutput(true);
	    con.setDoInput(true);
	    os = con.getOutputStream();
	    os.write(postData);
	    os.flush();

	    reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
	    String lines;
	    StringBuffer sb = new StringBuffer("");
	    while ((lines = reader.readLine()) != null) {
		lines = new String(lines.getBytes(), "utf-8");
		sb.append(lines);
	    }

	    data = sb.toString();
	    reader.close();
	    con.disconnect();
	    JSONObject ret = null;
	    if (data != null && !data.equals("")) {
		ret = new JSONObject(data);
	    }
	    return ret;
	} catch (Exception e) {
	    throw e;
	} finally {
	    try {
		if (os != null) {
		    os.close();
		}
		if (reader != null) {
		    reader.close();
		}
	    } catch (Exception e2) {
		throw e2;
	    }
	}

    }

    public static String doPostStr(String url, byte[] postData) throws Exception {
	OutputStream os = null;
	BufferedReader reader = null;
	try {
	    URL dataUrl = new URL(url);
	    HttpURLConnection con = (HttpURLConnection) dataUrl.openConnection();
	    con.setRequestMethod("POST");
	    con.setRequestProperty("Proxy-Connection", "Keep-Alive");
	    con.setRequestProperty("accept", "*/*");
	    con.setRequestProperty("connection", "Keep-Alive");
	    // con.setRequestProperty("Content-type", "application/json"
	    // + ";charset=UTF-8");
	    con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
	    con.setDoOutput(true);
	    con.setDoInput(true);
	    os = con.getOutputStream();
	    os.write(postData);
	    os.flush();

	    reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
	    String lines;
	    StringBuffer sb = new StringBuffer("");
	    while ((lines = reader.readLine()) != null) {
		lines = new String(lines.getBytes(), "utf-8");
		sb.append(lines);
	    }
	    con.disconnect();
	    return sb.toString();
	} catch (Exception e) {
	    throw e;
	} finally {
	    try {
		if (os != null) {
		    os.close();
		}
		if (reader != null) {
		    reader.close();
		}
	    } catch (Exception e2) {
		throw e2;
	    }
	}

    }

    public static void write(HttpServletResponse response, JSONObject obj) {
	try {
	    response.setCharacterEncoding("UTF-8");
	    String str = obj.toString();
	    if (str != null && !str.equals("")) {
		response.getWriter().write(str);
	    }
	    response.flushBuffer();
	} catch (Exception e) {
	} finally {
	    try {
		if (response.getWriter() != null) {
		    response.getWriter().close();
		}
	    } catch (Exception e2) {
		e2.printStackTrace();
	    }
	}
    }

    public static void write(HttpServletResponse response, String str) {
	try {
	    response.setCharacterEncoding("UTF-8");
	    if (str != null && !str.equals("")) {
		response.getWriter().write(str);
	    }
	    response.flushBuffer();
	} catch (Exception e) {
	} finally {
	    try {
		if (response.getWriter() != null) {
		    response.getWriter().close();
		}
	    } catch (Exception e2) {
		e2.printStackTrace();
	    }
	}
    }
}
