package com.server.core.service;

/**
 * @author nullzZ
 * 
 */
public class LoginResult {

    /**
     * 服务器生成的userId
     */
    private long userId;
    private String token;

    public LoginResult(long userId, String token) {
	this.userId = userId;
	this.token = token;
    }

    public long getUserId() {
	return userId;
    }

    public void setUserId(long userId) {
	this.userId = userId;
    }

    public String getToken() {
	return token;
    }

    public void setToken(String token) {
	this.token = token;
    }

}
