package com.jspiders.appone.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jspiders.appone.entities.User;
import com.jspiders.appone.repository.UserRepository;

public class UserService {

	UserRepository usrRepo = new UserRepository();
	User u1 = null;

	public void showProfile(String email) {
		System.out.println(u1.getUid());
		System.out.println(u1.getName());
		System.out.println(u1.getEmail());
		System.out.println(u1.getMob());
	}

	public void showAllUserProfiles() {
		try {
			List<User> userList = usrRepo.selectAll();

			for (int index = 0; index < userList.size(); index++) {
				User u1 = userList.get(index);

				System.out.println(u1.getUid());
				System.out.println(u1.getName());
				System.out.println(u1.getEmail());
				System.out.println(u1.getMob());
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void login(String entEmail, String entMob) {
		try {
			u1 = usrRepo.selectOne(entEmail);

			String email = u1.getEmail();
			String mob = u1.getMob();

			if (email.equals(entEmail) && mob.equals(entMob)) {
				System.out.println("Login sucess");
				showProfile(email);
			} else {
				System.out.println("Invalid Username or Password");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("catch block");
			System.out.println(entEmail + " does not exist please create an account");
		}
	}

	public void signup(String name, String email, String mob)
	{
		List<String> values = new ArrayList<String>();

		values.add(name);
		values.add(email);
		values.add(mob);

		try 
		{
			int count = usrRepo.insert(values);
			
			if(count>0)
			{
				System.out.println("user signup successfull");
			}
		}
		
		catch (SQLException e)
		{
			System.out.println("ERROR!! user with "+email+" already exists");
			System.out.println("Please login or use different email");
		}
	}
	
	
	public void updateProfile(String name, String email, String mob,String currEmail)
	{
		List<String> values = new ArrayList<String>();

		values.add(name);
		values.add(email);
		values.add(mob);
		
		try 
		{
			usrRepo.update(values,currEmail);
			System.out.println("User details updated");
		} 
		catch (SQLException e) 
		{
			System.out.println("User with "+currEmail+" does not exist");
		}
	}
	
}



