package com.ems.repositories;

public class DepartmentRepository 
extends RepoUtils
implements Repository 
{
	public void insert(Object obj) 
	{
		createSession();
		
		tx = session.beginTransaction();
		
		session.save(obj);
		
		tx.commit();
		
		closeSession();
		
		System.out.println("Department added with projects");
	}

	public void update(Object obj) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Object obj) {
		// TODO Auto-generated method stub
		
	}

	public Object selectOne(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

}
