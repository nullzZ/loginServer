package com.server.core.cach;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.server.db.model.ServerRecord;

/**
 * 
 * @author nullzZ
 *
 */
public class ServerManager {
    private Map<String, List<ServerRecord>> channel_server = new ConcurrentHashMap<>();// k渠道,v服务器
    private Map<String, ServerRecord> servers = new ConcurrentHashMap<>();

    private static final ServerManager instance = new ServerManager();

    private ServerManager() {

    }

    public static ServerManager getInstance() {
	return instance;
    }

    public ServerRecord get(String serverId) {
	ServerRecord server = servers.get(serverId);
	if (server == null) {
	    return null;
	}
	return server;
    }

    public Map<String, ServerRecord> getServers() {
	return servers;
    }

    // 获取渠道对应的servers

    public boolean putServer(ServerRecord sr) {
	if (servers.containsKey(sr.getServerId())) {
	    return false;
	} else {
	    servers.put(sr.getServerId(), sr);
	    return true;
	}
    }

    public boolean putChannelServer(String channelId, String serverIds) {
	String[] server = serverIds.split(";");
	for (int i = 0; i < server.length; i++) {
	    ServerRecord s = servers.get(server[i]);
	    if (s == null) {
		return false;
	    }
	    List<ServerRecord> list;
	    if (!channel_server.containsKey(channelId)) {
		list = new ArrayList<>();
		channel_server.put(channelId, list);
	    } else {
		list = channel_server.get(channel_server);
	    }
	    list.add(s);
	}

	return true;
    }

    public void clear() {
	channel_server.clear();
	servers.clear();
    }

}
