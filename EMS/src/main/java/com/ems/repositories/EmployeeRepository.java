package com.ems.repositories;

import com.ems.entities.Employee;

public class EmployeeRepository
extends RepoUtils 
implements Repository {

	public void insert(Object obj) 
	{
		createSession();

		tx = session.beginTransaction();

		session.save(obj);// insert

		tx.commit();

		closeSession();

		System.out.println("Employee added to DB");

	}

	public void update(Object obj) {
		// TODO Auto-generated method stub

	}

	public void delete(Object obj) {
		// TODO Auto-generated method stub

	}

	public Object selectOne(Object id) {

		createSession();
		
		tx = session.beginTransaction();
		
		Employee e1 = session.get(Employee.class, id);
		
		tx.commit();
	
		closeSession();
		
		return e1;
	}
}




