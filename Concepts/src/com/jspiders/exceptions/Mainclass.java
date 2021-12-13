package com.jspiders.exceptions;

public class Mainclass 
{
	public static void test1()
	{
		System.out.println("this is test1()");
		test2();//call test2()
	}
	
	public static void test2()
	{
		System.out.println("this is test2()");
		test1();//call test1()
	}
	
	
	public static void div(int n,int d)
	{
		System.out.println("div() starts..");
		
		System.out.println("INPUTS : "+"n = "+n+" d = "+d);
		
		int res = 0;
		
		res = n / d;
		
		System.out.println("OUTPUT : "+res);
		
		System.out.println("div() ends..");
		
		return;//stop execution and exit from STACK
	}
	
	public static void main(String[] args)
	{
	   System.out.println("main() starts..");
	   
	   test1();
	   
	   System.out.println("main() ends..");
	}
}
