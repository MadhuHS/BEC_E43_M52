package com.jspiders.arrays;

public class Mainclass 
{
	public static void main(String[] args)
	{
		int[] a1 = new int[5];//create an array
		
		a1[0] = 51;//add values to array
		a1[1] = 28;
		a1[2] = 80;
		a1[3] = 911;
		a1[4] = 42;
		
		System.out.println(a1[0]);//print one element
		
		System.out.println();//print all elements
		
		//print all elements
		for (int i = 0; i < a1.length; i++) 
		{
		   System.out.println(a1[i]);	
		}	
		
		Integer i1 = 61;
		
		Integer[] ia = new Integer[5];
		
		ia[0] = 61;
		
		Object obj = new Object();
		
		Object[] ar1 = new Object[2];
		ar1[0] = new Object();
		
	}
}







