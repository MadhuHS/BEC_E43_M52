package com.jspiders.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jspiders.entities.Employee;

public class Mainclass
{
	public static void main(String[] args)
	{
		System.out.println("Program starts...");
		
		SessionFactory sf = null;
		
		sf = new Configuration().configure().buildSessionFactory();
		
		Session s1 = sf.openSession();//open session
		
		Employee e1 = new Employee(2,"EMP2","QA",9876543212l,35412.21, 10);
		
		Transaction tx = s1.beginTransaction();
		
		s1.save(e1);//insert
		
		tx.commit();//save changes
		
		s1.close();//close session
		
		sf.close();//close sessionFactory


		System.out.println("Program ends...");
	}
}
