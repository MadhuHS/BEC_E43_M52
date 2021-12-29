package com.jspiders.appone.test;

import com.jspiders.appone.services.UserService;

public class ApponeTest {

	private static UserService us1 = new UserService();
	 
	public static void signupTest()
	{
		us1.signup("madhu","madhu@gmail.com","1234567890");
	}
	
	public static void loginTest()
	{
		us1.login("madhu@gmail.com","1234567890");
	}
	
	public static void main(String[] args) 
	{
	   //signupTest();
		loginTest();
	}
}
