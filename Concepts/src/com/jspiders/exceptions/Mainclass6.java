package com.jspiders.exceptions;

public class Mainclass6 
{
	public static void div(int n, int d) throws ArithmeticException
	{
		System.out.println("div() starts..");

		System.out.println("INPUTS : " + "n = " + n + " d = " + d);

		int res = 0;
      
		res = n / d;
		System.out.println("OUTPUT : " + res);
		
		System.out.println("div() ends..");

		return;// stop execution and exit from STACK
	}

	public static void main(String[] args) 
	{
		System.out.println("main() starts..");
        
		try
		{
		  div(10,0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ArithmeticException handled in main()");
		}

		System.out.println("main() ends..");
	}
}




