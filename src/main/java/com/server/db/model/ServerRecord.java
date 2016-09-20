package com.server.db.model;

public class ServerRecord {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column t_servers.uid
     * @mbggenerated
     */
    private Integer uid;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column t_servers.name
     * @mbggenerated
     */
    private String name;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column t_servers.channelId
     * @mbggenerated
     */
    private String channelId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column t_servers.serverId
     * @mbggenerated
     */
    private String serverId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column t_servers.host
     * @mbggenerated
     */
    private String host;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column t_servers.port
     * @mbggenerated
     */
    private Integer port;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column t_servers.uid
     * @return  the value of t_servers.uid
     * @mbggenerated
     */
    public Integer getUid() {
	return uid;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column t_servers.uid
     * @param uid  the value for t_servers.uid
     * @mbggenerated
     */
    public void setUid(Integer uid) {
	this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column t_servers.name
     * @return  the value of t_servers.name
     * @mbggenerated
     */
    public String getName() {
	return name;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column t_servers.name
     * @param name  the value for t_servers.name
     * @mbggenerated
     */
    public void setName(String name) {
	this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column t_servers.channelId
     * @return  the value of t_servers.channelId
     * @mbggenerated
     */
    public String getChannelId() {
	return channelId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column t_servers.channelId
     * @param channelId  the value for t_servers.channelId
     * @mbggenerated
     */
    public void setChannelId(String channelId) {
	this.channelId = channelId == null ? null : channelId.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column t_servers.serverId
     * @return  the value of t_servers.serverId
     * @mbggenerated
     */
    public String getServerId() {
	return serverId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column t_servers.serverId
     * @param serverId  the value for t_servers.serverId
     * @mbggenerated
     */
    public void setServerId(String serverId) {
	this.serverId = serverId == null ? null : serverId.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column t_servers.host
     * @return  the value of t_servers.host
     * @mbggenerated
     */
    public String getHost() {
	return host;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column t_servers.host
     * @param host  the value for t_servers.host
     * @mbggenerated
     */
    public void setHost(String host) {
	this.host = host == null ? null : host.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column t_servers.port
     * @return  the value of t_servers.port
     * @mbggenerated
     */
    public Integer getPort() {
	return port;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column t_servers.port
     * @param port  the value for t_servers.port
     * @mbggenerated
     */
    public void setPort(Integer port) {
	this.port = port;
    }
}