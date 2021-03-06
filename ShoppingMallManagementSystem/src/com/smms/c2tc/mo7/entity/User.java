package com.smms.c2tc.mo7.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "Details")
public class User {
	@Id
	private long Id;
	@Column(name ="name")
	private String name;
	private String type;
	private String password;
	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", type=" + type + ", password=" + password + "]";
	}
	
	}
	

