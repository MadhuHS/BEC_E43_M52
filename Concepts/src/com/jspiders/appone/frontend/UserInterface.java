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

		switch (optn) {
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
			break;

		default:
			System.out.println("Thank you for using Appone");
			System.exit(0);
		}
	}
}
