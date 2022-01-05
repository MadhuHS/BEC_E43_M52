package com.jspiders.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Mainclass
{
	public static void main(String[] args)
	{
		System.out.println("Program starts...");
		
		SessionFactory sf = null;
		
		sf = new Configuration().configure().buildSessionFactory();
		
		Session s1 = sf.openSession();//open session
		
		
		s1.close();//close session
		
		sf.close();//close sessionFactory

		
		System.out.println("Program ends...");
	}
}
