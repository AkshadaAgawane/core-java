package com.smms.c2tc.m07.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smms.c2tc.m07.entity.User;
import com.smms.c2tc.m07.repo.UserRepo;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepo ur;

	@Override
	public void addUser(User user) {
		ur.save(user);
	}

	@Override
	public int deleteUser(int id) {
		User user=ur.findById(id).get();
		ur.delete(user);
		return 1;
	}

	@Override
	public User updateUser(User u) {
		User user=ur.save(u);
		return user;
	}

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean logOut() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getUser(int id) {
		User user=ur.findById(id).get();
		return user;
	}

	@Override
	public List<User> getUser() {
		List<User> list=ur.findAll();
		return ur.findAll();
	}

	

}
