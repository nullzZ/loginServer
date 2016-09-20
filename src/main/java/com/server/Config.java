package com.server;

import java.util.ArrayList;
import java.util.List;

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
    private static String CONFIG_PATH = System.getProperty("myLoginConfig");
    public static List<String> SafeIps = new ArrayList<>();

    public static void loadSafeIp() throws ConfigurationException {
	PropertiesConfiguration SAFEREMOTEHOST_CONFIG = new PropertiesConfiguration(
		CONFIG_PATH + "/safeRemoteHost.properties");
	SAFEREMOTEHOST_CONFIG.setReloadingStrategy(new FileChangedReloadingStrategy());// 自动重载
	String[] ips = SAFEREMOTEHOST_CONFIG.getStringArray("ip");
	for (String s : ips) {
	    SafeIps.add(s);
	}
    }
}
