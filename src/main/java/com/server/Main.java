package com.server;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.server.core.service.ServerSercice;

/**
 * 
 * @author nullzZ
 *
 */
@Service
public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);
    @Resource
    private ServerSercice serverSercice;

    @PostConstruct
    public void init() {
	try {
	    Config.loadSafeIp();
	    serverSercice.load();

	    logger.info("[启动]登录服务器启动成功-------------!");
	} catch (Exception e) {
	    e.printStackTrace();
	    System.exit(0);
	}
    }

}
