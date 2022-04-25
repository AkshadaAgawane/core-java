package com.smms.c2tc.mo7.dao;

import com.smms.c2tc.mo7.entity.User;

public interface UserDao {

	void addUser(User user);
	
	void updateUser(User user);
	
	void deleteUser(long id);

	void startTransaction();

	void endTransaction();

	User getUser(int i);

	

	
}
