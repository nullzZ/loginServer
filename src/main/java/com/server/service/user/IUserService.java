package com.server.service.user;

import com.server.ChannelEnum;
import com.server.db.model.UserRecord;

/**
 * 
 * @author nullzZ
 *
 */
public interface IUserService {
    public boolean insertDB(UserRecord user);

    public UserRecord createUser(ChannelEnum channelEnum, String sdk_uid, String channel, String lastServerId);

    public UserRecord getUser(ChannelEnum channelEnum, String sdk_uid, String channel);

    public UserRecord selectUserRecordByDB(ChannelEnum channelEnum, String sdk_uid, String channel);

}