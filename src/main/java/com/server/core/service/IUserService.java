package com.server.core.service;

import com.server.ChannelEnum;
import com.server.db.model.UserRecord;

/**
 * 
 * @author nullzZ
 *
 */
public interface IUserService {
    public boolean insertDB(UserRecord user);

    public UserRecord createUser(ChannelEnum channelEnum, String sdk_uid, String channel, String lastServerId,
	    String device, String deviceVersion, String loginIP);

    public UserRecord getUser(ChannelEnum channelEnum, String sdk_uid, String channel);

    public UserRecord selectUserRecordByDB(ChannelEnum channelEnum, String sdk_uid, String channel);

    public boolean updateUserRecord(UserRecord user);

    public UserRecord register(ChannelEnum channelEnum, String uid, String serverID, String channelID, String device,
	    String deviceVersion, String loginIP);
}
