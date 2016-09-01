package com.server.core.cach;

import java.util.concurrent.ConcurrentHashMap;

import com.server.core.Config;
import com.server.db.model.UserRecord;

/**
 * 
 * @author nullzZ
 *
 */
public class UserCach implements ICach<String, UserRecord> {
    private ConcurrentHashMap<String, UserRecord> cach = new ConcurrentHashMap<>();
    private static final UserCach instance = new UserCach();

    private UserCach() {

    }

    public static UserCach getInstance() {
	return instance;
    }

    @Override
    public UserRecord get(String userId) {
	return cach.get(userId);
    }

    @Override
    public boolean check(String userId) {
	return cach.containsKey(userId);
    }

    @Override
    public UserRecord put(String key, UserRecord user) {
	if (cach.size() >= Config.UserCachSize) {
	    cach.clear();
	}
	return cach.put(key, user);
    }

}
