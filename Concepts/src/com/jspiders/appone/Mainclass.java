package com.jspiders.appone;

import com.jspiders.appone.services.UserService;

public class Mainclass {

	static UserService us1 = new UserService();
	
	public static void main(String[] args) 
	{
		System.out.println("Program starts...");
		
		us1.login("virat@rcb.com","9876543210");
		
		//us1.showProfile("virat@rcb.com");
		
		System.out.println("Program ends...");
	}

}
