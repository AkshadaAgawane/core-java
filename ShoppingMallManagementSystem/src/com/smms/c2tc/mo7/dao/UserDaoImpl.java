package com.smms.c2tc.mo7.dao;

import javax.persistence.EntityManager;

import com.smms.c2tc.mo7.entity.User;

public class UserDaoImpl implements UserDao {
    EntityManager entityManager;
    public UserDaoImpl() {
    	entityManager=Configuration.getEntityManager();
    }
	@Override
	public void addUser(User user) {
		entityManager.persist(user);
		
	}
	@Override
	public void startTransaction() {
		entityManager.getTransaction().begin();
		
	}
	@Override
	public void endTransaction() {
		entityManager.getTransaction().commit();
	}
	@Override
	public void updateUser(User user) {
		entityManager.merge(user);
		
		
	}
	@Override
	public void deleteUser(long id) {
		User u=entityManager.find(User.class,id);
		entityManager.remove(u);
		
		
	}
	
		
		
}

