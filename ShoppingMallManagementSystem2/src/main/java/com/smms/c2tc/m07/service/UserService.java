package com.smms.c2tc.m07.service;

import java.util.List;

import com.smms.c2tc.m07.entity.User;

public interface UserService {

	public void addUser(User user);
	public int deleteUser(int id);
	public User updateUser(User user);
	public void login(User user);
	public boolean logOut();
	public User getUser(int id);
	public List<User>getUser();
	
}
