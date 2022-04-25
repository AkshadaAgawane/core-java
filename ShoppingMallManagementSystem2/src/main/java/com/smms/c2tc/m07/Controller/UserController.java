package com.smms.c2tc.m07.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.smms.c2tc.m07.entity.User;
import com.smms.c2tc.m07.service.UserService;

@RestController
public class UserController {
    @Autowired
	UserService service;
    @PostMapping("/addUser")
    public void addUser(@RequestBody User user)
    {
    	service.addUser(user);
    }
    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable int id)
    {
    	return service.getUser(id);
    }
    @GetMapping("/getUser")
    public List<User> getUser()
    {
    	return service.getUser();
    }
    @PutMapping("/updateUser")
    public User updateUser(@RequestBody User user)
    {
    	return service.updateUser(user);
    }
    @DeleteMapping("/deleteUser/{id}")
    public int deleteUser(int id)
    {
    	return service.deleteUser(id);
    }
}
