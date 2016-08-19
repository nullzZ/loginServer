package com.server;

import javax.annotation.PostConstruct;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * 
 * @author nullzZ
 *
 */
@Service
public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    @PostConstruct
    public void init() {
	try {
	    Config.loadServers();

	    logger.info("[启动]登录服务器启动成功-------------!");
	} catch (ConfigurationException e) {
	    e.printStackTrace();
	    System.exit(0);
	}
    }

}
