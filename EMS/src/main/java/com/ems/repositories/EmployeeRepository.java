package com.ems.repositories;

import com.ems.entities.Employee;

public class EmployeeRepository extends RepoUtils {

	public void insert(Employee emp)
	{
		createSession();
		
		tx = session.beginTransaction();
		
		session.save(emp);//insert
		
		tx.commit();
		
		closeSession();
		
		System.out.println("Employee added to DB");
	}
}
