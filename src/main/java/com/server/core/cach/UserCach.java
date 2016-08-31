package com.server.core.cach;

import java.util.concurrent.ConcurrentHashMap;

import com.server.db.model.UserRecord;

/**
 * 
 * @author nullzZ
 *
 */
public class UserCach implements ICach<String, UserRecord> {
    private ConcurrentHashMap<String, UserRecord> cach = new ConcurrentHashMap<>();
    private int size = 100000;
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
	if (cach.size() > size) {
	    cach.clear();
	    size = 0;
	} else {
	    size++;
	}
	return cach.put(key, user);
    }

}
