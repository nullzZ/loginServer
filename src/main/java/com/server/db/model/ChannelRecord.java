package com.server.db.model;

public class ChannelRecord {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column channels.uid
     *
     * @mbggenerated
     */
    private Long uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column channels.channel
     *
     * @mbggenerated
     */
    private String channel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column channels.servers
     *
     * @mbggenerated
     */
    private String servers;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column channels.uid
     *
     * @return the value of channels.uid
     *
     * @mbggenerated
     */
    public Long getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column channels.uid
     *
     * @param uid the value for channels.uid
     *
     * @mbggenerated
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column channels.channel
     *
     * @return the value of channels.channel
     *
     * @mbggenerated
     */
    public String getChannel() {
        return channel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column channels.channel
     *
     * @param channel the value for channels.channel
     *
     * @mbggenerated
     */
    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column channels.servers
     *
     * @return the value of channels.servers
     *
     * @mbggenerated
     */
    public String getServers() {
        return servers;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column channels.servers
     *
     * @param servers the value for channels.servers
     *
     * @mbggenerated
     */
    public void setServers(String servers) {
        this.servers = servers == null ? null : servers.trim();
    }
}