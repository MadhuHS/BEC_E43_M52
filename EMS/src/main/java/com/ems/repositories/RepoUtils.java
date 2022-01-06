package com.ems.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public abstract class RepoUtils {

	private SessionFactory sessionFactory = null;
	
	Session session = null;
	Transaction tx = null;
	
	public void createSession()
	{
         sessionFactory = new Configuration()
        		              .configure()
        		              .buildSessionFactory();
		
		 session = sessionFactory.openSession();//open session
	}
	
	public void closeSession()
	{
		session.close();//close session
		
		sessionFactory.close();//close Session Factory
	}
}
