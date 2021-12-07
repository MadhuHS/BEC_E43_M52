package com.jspiders.pkg1;

import com.jspiders.pkg2.Demo;

//Access Specifiers
public class Mainclass2 extends Demo
{
	public static void main(String[] args) 
	{
	  Demo d1 = new Demo();//create an object of Superclass
	  
	  System.out.println("v1 : "+d1.v1);
	  d1.test1();
	  
	  Mainclass2 m1 = new Mainclass2();//create an object of Subclass
	  
	  System.out.println("v2 : " + m1.v2);
	  m1.test2();
	  
	}
}
