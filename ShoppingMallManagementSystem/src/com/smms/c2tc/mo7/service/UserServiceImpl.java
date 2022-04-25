package com.smms.c2tc.mo7.service;

import com.smms.c2tc.mo7.dao.UserDao;
import com.smms.c2tc.mo7.dao.UserDaoImpl;
import com.smms.c2tc.mo7.entity.User;

public class UserServiceImpl implements UserService {
	UserDao ud;
	public UserServiceImpl()
	{
		ud=new UserDaoImpl();
	}
	@Override
	public void addUser(User user) {
		ud.startTransaction();
		ud.addUser(user);
		ud.endTransaction();
	}
	@Override
	public void updateUser(User user) {
		ud.startTransaction();
		ud.updateUser(user);
		ud.endTransaction();
	}
	@Override
	public void loginUser(User user) {
		
		
	}
	@Override
	public boolean logout() {
		return false;
	}
	
	@Override
	public void deleteUser(long id) {
		ud.startTransaction();
		ud.deleteUser(id);
		ud.endTransaction();
		
	}
	@Override
	public User getUser(int id) {
		User u=ud.getUser(id);
		return u;
	}
	
	
	
	
		
	}
	
	


