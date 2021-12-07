package com.jspiders.pkg1;

import com.jspiders.pkg2.Sample;

public class Mainclass
{
	public static void main(String[] args)
	{
       System.out.println("Program starts...");
       
       Sample.test();
       
       Sample s1 = new Sample ();
       
       s1.display();
       
       com.jspiders.pkg3.Sample.test();
       
       com.jspiders.pkg3.Sample ref1 = new com.jspiders.pkg3.Sample();
       
       ref1.display();
       
       System.out.println("Program ends...");
	}
}
