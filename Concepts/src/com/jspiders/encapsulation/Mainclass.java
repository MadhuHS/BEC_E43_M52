package com.jspiders.encapsulation;

public class Mainclass 
{ 
	static User u1 = new User();
	
	public static void login(String loginId,String password,String role)
	{
		//get user data from Repo
		String id = u1.getLoginId();
		String pwd = u1.getPassword();
		String rol = u1.getRole();
		
		u1.setLoginId("user2@yahoo.com");//modify
		
		if(id.equals(loginId) && pwd.equals(password))
		{
			System.out.println("login done");
	        System.out.println(u1.getLoginId());
		}
		else
		{
			System.out.println("login failed");
		}
		
	}
	
	public static void signup(String loginId,String password,String role)
	{
		//set the user data to Repo
		u1.setLoginId(loginId);
		u1.setPassword(password);
		u1.setRole(role);
		
		System.out.println("signup done");
	}
	public static void main(String[] args) 
	{
	   System.out.println("Program starts...");	
	   signup("user1@gmail.com","user1","cust");
	   login("user1@gmail.com","user1","cust");
	   System.out.println("Program ends...");	
	}
}


