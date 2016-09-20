package com.server.core.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.server.core.cach.ServerManager;
import com.server.db.dao.ServerRecordMapper;
import com.server.db.model.ServerRecord;
import com.server.db.model.ServerRecordExample;

@Service
public class ServerSercice implements IServerService {
    private static final Logger logger = Logger.getLogger(ServerSercice.class);
    @Resource
    private ServerRecordMapper serverRecordMapper;

    public void load() {
	ServerRecordExample example = new ServerRecordExample();
	List<ServerRecord> list = serverRecordMapper.selectByExample(example);
	if (list != null && !list.isEmpty()) {
	    for (ServerRecord sr : list) {
		ServerManager.getInstance().put(sr);
	    }
	}
	logger.info("加载服务器成功~~~~");
    }

    public void reload() {
	ServerManager.getInstance().clear();
	this.load();
    }
}
