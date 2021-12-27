package com.jspiders.appone.services;

import java.sql.SQLException;

import com.jspiders.appone.entities.User;
import com.jspiders.appone.repository.UserRepository;

public class UserService {

	UserRepository usrRepo = new UserRepository();
	User u1 = null;
	
	public void showProfile(String email)
	{
		  System.out.println(u1.getUid());
		  System.out.println(u1.getName());
		  System.out.println(u1.getEmail());
		  System.out.println(u1.getMob());
	}
	
	public void login(String entEmail,String entMob)
	{
		try 
		{
		  User u1 = usrRepo.selectOne(entEmail);
		  
		  String email = u1.getEmail();
		  String mob = u1.getMob();
		  
		  if(email.equals(entEmail) && mob.equals(entMob))
		  {
			  System.out.println("Login sucess");
			  showProfile(email);
		  }
		  else
		  {
			  System.out.println("Invalid Username or Password");
		  }
		  
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		catch (NullPointerException e)
		{
			System.out.println("catch block");
			System.out.println(entEmail+" does not exist please create an account");
		}
	}
}






