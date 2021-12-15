package com.jspiders.exceptions;

public class Mainclass7 
{
	public static void test(int n) throws IllegalArgumentException
	{
		System.out.println("div() starts..");

		System.out.println("INPUTS : " + "n = " + n);
		
		if(n >= 1 && n <= 10)
		{
			System.out.println("VALID");
		}
		else
		{
			String message = "n should be between 1 to 10 only";
			IllegalArgumentException i1 = new IllegalArgumentException(message);
			throw i1;
		}

		System.out.println("div() ends..");

		return;// stop execution and exit from STACK
	}

	public static void main(String[] args) 
	{
		System.out.println("main() starts..");
        
		try
		{
		  test(100);
		}
		catch(IllegalArgumentException ie)
		{
			ie.printStackTrace();
			System.out.println(ie.getMessage());
		}

		System.out.println("main() ends..");
	}
}




