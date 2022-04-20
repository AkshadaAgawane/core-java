package com.smms.c2tc.mo7;

import com.smms.c2tc.mo7.entity.User;
import com.smms.c2tc.mo7.service.UserService;
import com.smms.c2tc.mo7.service.UserServiceImpl;

public class Client {

	public static void main(String[] args) {
		UserService service=new UserServiceImpl();
		User user=new User();
		user.setId(2110602);
		user.setName("Akshada Agawane");
		user.setPassword("@123");
		user.setType("abc");
		//service.addUser(user);
      
        //service.updateUser(user);
		
	
      
        
	}

}
