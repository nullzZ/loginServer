package com.server.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.server.core.cach.ServerManager;
import com.server.core.service.ServerSercice;
import com.server.core.util.HttpUtil;
import com.server.core.util.JSONUtils;
import com.server.db.model.ServerRecord;

@Controller
@RequestMapping("/s")
public class ServerAction {
    @Resource
    private ServerSercice serverSercice;

    @RequestMapping(value = "/servers", method = RequestMethod.POST)
    public void getServers(HttpServletRequest request, HttpServletResponse response) {
	List<ServerRecord> list = ServerManager.getInstance().getServers();
	JSONObject obj = new JSONObject();
	JSONArray array = new JSONArray();
	for (ServerRecord s : list) {
	    array.put(JSONUtils.toJson(s));
	}
	try {
	    obj.put("servers", array);
	    HttpUtil.write(response, obj);
	} catch (JSONException e) {
	    e.printStackTrace();
	}
    }

    @RequestMapping(value = "/reloadServer", method = RequestMethod.POST)
    public void reloadServer(HttpServletRequest request, HttpServletResponse response) {
	serverSercice.reload();
    }

    @RequestMapping(value = "/addServer", method = RequestMethod.POST)
    public void addServer(HttpServletRequest request, HttpServletResponse response) {

    }

    @RequestMapping(value = "/modifyServer", method = RequestMethod.POST)
    public void modifyServer(HttpServletRequest request, HttpServletResponse response) {

    }

    @RequestMapping(value = "/delServer", method = RequestMethod.POST)
    public void delServer(HttpServletRequest request, HttpServletResponse response) {

    }
}
