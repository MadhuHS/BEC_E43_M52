package com.jspiders.appone.frontend;

import java.util.Scanner;

import com.jspiders.appone.services.UserService;

public class UserInterface {
	private Scanner scn = new Scanner(System.in);

	private UserService us1 = new UserService();

	public void loginPage() {
		System.out.println("Welcome to AppOne");

		System.out.println("Please choose your option");

		System.out.println("1. Signup");
		System.out.println("2. Login");
		System.out.println("any other key to Exit");

		int optn = scn.nextInt();

		String name;
		String email;
		String mob;

		switch (optn) 
		{
		case 1:
			System.out.println("enter your name");
			name = scn.next();
			System.out.println("enter your email");
			email = scn.next();
			System.out.println("enter your mob");
			mob = scn.next();
			us1.signup(name, email, mob);
			break;

		case 2:
			System.out.println("enter your email");
			email = scn.next();
			System.out.println("enter your password");
			mob = scn.next();
			
			us1.login(email, mob);
			
			while(true)
			{
			
			System.out.println("Enter your choice");
			System.out.println("1. Show Profile");
			System.out.println("2. Update Profile");
			System.out.println("3. Delete Account");
			System.out.println("4. Logout");
			
			int choice = scn.nextInt();
			
			switch(choice)
			{
			case 1 : profilePage();
			         break;
			case 2 : updateProfilePage();
			         break;
			case 3 : deleteAccountPage();
			         break;
			         
			default : System.exit(0);
			
			}
			
			break;
			}

		default:
			System.out.println("Thank you for using Appone");
			System.exit(0);
		}
	}
	
	public void profilePage()
	{
		System.out.println("enter your email");
		
		String email = scn.next();
		
		us1.showProfile(email);
	}
	
	public void updateProfilePage()
	{
		System.out.println("enter your name");
		String newName = scn.next();
		
		System.out.println("enter your email");
		String newEmail = scn.next();
		
		System.out.println("enter your mob");
		String newMob = scn.next();
		
		System.out.println("enter your current email");
		String currEmail = scn.next();
		
		us1.updateProfile(newName, newEmail, newMob, currEmail);
	}
	
	public void deleteAccountPage()
	{
		System.out.println("enter your current email");
		String currEmail = scn.next();
		us1.deleteAccount(currEmail);
		
	}
	
}



