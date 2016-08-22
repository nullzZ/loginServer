package com.server.service.user;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.server.ChannelEnum;
import com.server.db.dao.UserRecordMapper;
import com.server.db.model.UserRecord;
import com.server.db.model.UserRecordExample;
import com.server.util.UqIdUtil;

/**
 * 
 * @author nullzZ
 *
 */
@Service
public class UserService implements IUserService {
    private static final Logger logger = Logger.getLogger(UserService.class);
    @Resource
    private UserRecordMapper userRecordMapper;

    // @Override
    // public UserRecord registerUser(String uid, int channel, int lastServerId)
    // {
    // String userId = this.getUniqeUserId(uid, channel);
    // if (UserCach.getInstance().check(userId)) {
    // return UserCach.getInstance().get(userId);
    // } else {
    // UserRecord record = selectUserRecordByDB(uid, channel);
    // if (null == record) {
    // return this.createUser(uid, channel, lastServerId);
    // } else {
    // return record;
    // }
    // }
    // }
    @Override
    public boolean insertDB(UserRecord user) {
	return userRecordMapper.insertSelective(user) > 0;
    }

    @Override
    public UserRecord createUser(ChannelEnum channelEnum, String sdk_uid, String channel, String lastServerId) {
	UserRecord record = new UserRecord();
	long userId = UqIdUtil.buildUqId();
	record.setUserId(userId);
	record.setSdkCannel(channelEnum.value);
	record.setSdk_uid(sdk_uid);
	record.setChannel(channel);
	record.setLastServerId(lastServerId);
	Date d = new Date();
	record.setCreateTime(d);
	record.setLoginTimestamp(d);

	if (this.insertDB(record)) {
	    // UserCach.getInstance().put(record);
	    return record;
	} else {
	    logger.error("创建user失败");
	    return null;
	}

    }

    @Override
    public UserRecord getUser(ChannelEnum channelEnum, String sdk_uid, String channel) {
	// 可以加入缓存
	UserRecord record = this.selectUserRecordByDB(channelEnum, sdk_uid, channel);
	return record;
    }

    @Override
    public UserRecord selectUserRecordByDB(ChannelEnum channelEnum, String uid, String channel) {
	UserRecordExample e = new UserRecordExample();
	e.createCriteria().andSdkCannelEqualTo(channelEnum.value).andSdk_uidEqualTo(uid).andChannelEqualTo(channel);
	List<UserRecord> records = userRecordMapper.selectByExample(e);
	if (records.size() > 0) {
	    return records.get(0);
	} else {
	    return null;
	}
    }

    @Override
    public boolean updateUserRecord(UserRecord user) {
	return userRecordMapper.updateByPrimaryKeySelective(user) > 0;
    }

    @Override
    public UserRecord register(ChannelEnum channelEnum, String uid, String serverID, String channelID) {
	UserRecord userRecord = this.getUser(channelEnum, uid, channelID);
	if (null == userRecord) {
	    userRecord = this.createUser(channelEnum, uid, channelID, serverID);
	    if (null == userRecord) {
		logger.debug("[登陆][注册用户失败]");
		return null;
	    }
	    logger.debug("[登陆][注册用户成功]");
	}
	userRecord.setLastServerId(serverID);
	userRecord.setLoginTimestamp(new Date());
	this.updateUserRecord(userRecord);//更新登录时间和服务器ID
	return userRecord;
    }

}
