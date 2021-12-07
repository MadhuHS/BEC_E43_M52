package com.jspiders.pkg2;

//Access Specifiers
public class Run 
{
	public static void main(String[] args)
	{
		Demo d1 = new Demo();

		System.out.println("v1 : " + d1.v1);
		d1.test1();
		
		System.out.println("v2 : " + d1.v2);
		d1.test2();
		
		System.out.println("v2 : " + d1.v3);
		d1.test3();
		
	}
}
