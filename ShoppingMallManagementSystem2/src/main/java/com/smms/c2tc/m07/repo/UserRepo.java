package com.smms.c2tc.m07.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.smms.c2tc.m07.entity.User;

public interface UserRepo extends 
              //CrudRepository<User,Integer>
              JpaRepository<User, Integer>{

	
}
