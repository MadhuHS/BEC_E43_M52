package com.jspiders.exceptions;

public class Mainclass4 {

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
		catch(ArithmeticException ae)
		{
		  System.out.println("Handled ArithmeticException");
		  System.out.println("CANNOT DIVIDE BY ZERO");
		}
		catch(ArrayIndexOutOfBoundsException arie)
		{
		  System.out.println("Handled ArrayIndexOutOfBoundsException");
		  System.out.println("INVALID INDEX");
		}

		System.out.println("test() ends..");

		return;// stop execution and exit from STACK
	}

	public static void main(String[] args) {
		System.out.println("main() starts..");

		test(10,10);

		System.out.println("main() ends..");
	}
}
