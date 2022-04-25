package com.smms.c2tc.mo7;

import com.smms.c2tc.mo7.entity.User;
import com.smms.c2tc.mo7.service.UserService;
import com.smms.c2tc.mo7.service.UserServiceImpl;

public class Client {

	public static void main(String[] args) {
		UserService service=new UserServiceImpl();
		User user=new User();
		user.setId(2110612);
		user.setName("Gauri Agawane");
		user.setPassword("!#@$");
		user.setType("ABC");
		//service.addUser(user);
	
        //service.updateUser(user);
		
		 //User u=service.getUser(21106609);
		    //System.out.println(u);
	        
      //service.deleteUser(2110606);
        
	}

}
