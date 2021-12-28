package com.jspiders.appone;

import com.jspiders.appone.services.UserService;

public class Mainclass {

	static UserService us1 = new UserService();
	
	public static void main(String[] args) 
	{
		System.out.println("Program starts...");
		
		//us1.signup("USER1","user1@gmail.com","1111111111");
		
		//us1.login("user1@gmail.com","1111111111");
		
		//us1.showAllUserProfiles();
		
		us1.updateProfile("Maxwell","maxwell@rcb.com","9876543214","user1@gmail.com");
		
		
		System.out.println("Program ends...");
	}

}
