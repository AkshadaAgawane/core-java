package com.smms.c2tc.mo7.service;

import com.smms.c2tc.mo7.entity.User;

public interface UserService {

	void addUser(User user);

	void updateUser(User user);
	
    void loginUser(User user);
    
    boolean logout();

	


}
