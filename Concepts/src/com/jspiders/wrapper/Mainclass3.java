package com.jspiders.wrapper;

public class Mainclass3
{
	public static boolean test(int num)
	{
	  int last = 0;
	  int temp = num;
	  int rev = 0;
	  
	  while(num!=0)
	  {
		  last = num % 10;
		  num = num / 10;
		  rev =  rev * 10 + last;
	  }
	  
	  if(temp == rev)
	  {
		  return true;
	  }
	  else
	  {
		  return false;
	  }
	}
	
	public static int test3(int num)
	{
	  int last = 0;
	  int count = 0;
	  int rev = 0;
	  
	  while(num!=0)
	  {
		  last = num % 10;
		  num = num / 10;
		  rev =  rev * 10 + last;
		  count++;
	  }
	  return count;
	}
	
	public static int test4(int num)
	{
	  /*String str = String.valueOf(num);
	 
	  int count = str.length();
	
	  return count;*/
	  
	  return String.valueOf(num).length();
	}
	
	public static boolean test5(long mob)
	{
	  return String.valueOf(mob).length() == 10;
	}
	
	public static boolean test2(int num)
	{
		int temp  = num;
		int rev = Integer.reverse(num);
		if(rev == temp)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public static void main(String[] args) 
	{
       
		boolean res ;
		res = test(123);
		System.out.println(res);
		
		res = test(10001);
		System.out.println(res);
		
	
		
		//128391821 -> 
		
		int res2 ;
		res2 = test3(128391821);
		System.out.println(res2);
		
		res2 = test4(128391821);
		System.out.println(res2);
        
	}
}









