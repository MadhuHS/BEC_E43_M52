package com.jspiders.exceptions;

public class Mainclass5 {

	public static void test(int n, int d) 
	{
		System.out.println("test() starts..");
		
		int[] a1 = {500,250,124,154};

		System.out.println("INPUTS : " + "n = " + n + " d = " + d);

		int res = 0;
        
		try
		{
		  res = n / d;
		  System.out.println("OUTPUT : " + a1[res]);
		}
		catch(Exception exp)
		{
		  exp.printStackTrace();
		}
		finally
		{
			System.out.println("finally block executed");
		}

		System.out.println("test() ends..");

		return;// stop execution and exit from STACK
	}

	public static void main(String[] args) {
		System.out.println("main() starts..");

		test(10,5);

		System.out.println("main() ends..");
	}
}
