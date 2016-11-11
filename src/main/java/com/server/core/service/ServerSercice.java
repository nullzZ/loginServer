package com.server.core.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.server.core.cach.ServerManager;
import com.server.db.dao.ChannelRecordMapper;
import com.server.db.dao.ServerRecordMapper;
import com.server.db.model.ChannelRecord;
import com.server.db.model.ChannelRecordExample;
import com.server.db.model.ServerRecord;
import com.server.db.model.ServerRecordExample;

@Service
public class ServerSercice implements IServerService {
    private static final Logger logger = Logger.getLogger(ServerSercice.class);
    @Resource
    private ServerRecordMapper serverRecordMapper;
    @Resource
    private ChannelRecordMapper channelRecordMapper;

    public void load() {
	ServerRecordExample example = new ServerRecordExample();
	List<ServerRecord> list = serverRecordMapper.selectByExample(example);
	if (list != null && !list.isEmpty()) {
	    for (ServerRecord sr : list) {
		if (!ServerManager.getInstance().putServer(sr)) {
		    logger.error("[加载服务器]有重复服务器ID" + sr.getServerId());
		}
	    }
	}

	List<ChannelRecord> channels = channelRecordMapper.selectByExample(new ChannelRecordExample());
	for (ChannelRecord cr : channels) {
	    if (!ServerManager.getInstance().putChannelServer(cr.getChannel(), cr.getServers())) {
		logger.error("[加载服务器]渠道,服务器ID不存在" + cr.getChannel() + "|" + cr.getServers());
	    }
	}

	logger.info("[加载服务器]成功~~~~");
    }

    public void reload() {
	ServerManager.getInstance().clear();
	this.load();
    }
}
