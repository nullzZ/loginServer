package com.server;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.reloading.FileChangedReloadingStrategy;

/**
 * 
 * @author nullzZ
 *
 */
public class Config {
    /**
     * anysdk统一登录地址
     */
    public static final String LOGIN_CHECK_URL = "http://oauth.anysdk.com/api/User/LoginOauth/";
    public static final String USER_AGENT = "px v1.0";
    public static final String KEY = "fjalwrjfkfj4723894723";
    public static final String VALUE = "235sgdsgds435435567df";
    public static final int PORT = 11102;
    private static String CONFIG_PATH = System.getProperty("myConfig");
    public static PropertiesConfiguration SERVERS_CONFIG;

    public static void loadServers() throws ConfigurationException {
	SERVERS_CONFIG = new PropertiesConfiguration(CONFIG_PATH + "/safeRemoteHost.properties");
	SERVERS_CONFIG.setReloadingStrategy(new FileChangedReloadingStrategy());// 自动重载
    }
}
