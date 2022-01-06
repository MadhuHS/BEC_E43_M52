package com.ems.frontend;

import com.ems.entities.Employee;
import com.ems.repositories.EmployeeRepository;

public class Mainclass 
{
	public static void main(String[] args) 
	{
		System.out.println("Program starts...");
		
		EmployeeRepository er = new EmployeeRepository();
		
		Employee e1 = new Employee(0,"EMP1","DEV",9877654321l,23213.1,10);
		
		er.insert(e1);
		
		System.out.println("Program ends...");
	}
}
