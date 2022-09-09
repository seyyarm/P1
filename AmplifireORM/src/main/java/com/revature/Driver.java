package com.revature;


import java.util.ArrayList;
import java.util.List;

import com.revature.dao.UserDao;


import com.revature.models.User;

public class Driver {
	
	static UserDao uDao = new UserDao();
	
	public static void main(String[] args) {
		System.out.println("Starting the program .............");
	
	
		//stub
		User u1 = new User("john","passjohn","john@email.com");
		 User user2 = new User("patricia","passpatricia","patricia@email.com"); 
		 User user3 = new User("evan","passevan","evan@email.com"); 
		 User user4 = new User("moh","passmoh","moh@email.com");
		 
	
	 	uDao.insert(u1);
	 	uDao.insert(user2); 
	 	uDao.insert(user3); 
	 	uDao.insert(user4);
	 
	System.out.println("insertion into Database completed");
	
	// Retrieve users from database
	
	//List<User> userList = new ArrayList<>();
	
	//uDao.listUsers();
	

	
	}
	

}
