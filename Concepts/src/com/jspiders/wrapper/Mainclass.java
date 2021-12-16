package com.jspiders.wrapper;

class Sample
{
	
}

public class Mainclass 
{
	public static void test(Object obj)
	{
		System.out.println("obj : "+obj);
		//20 lines
	}
	
	public static void main(String[] args) 
	{ 
        Integer i1  = 10;//Auto-boxing
        Byte b2 = 23;
        Boolean v2 = true;
        String s1   = "jspiders";      
        Sample ref1 = new Sample();
        
        Object v1 = 291;
        
        test(i1);
        test(b2);
        test(v2);
        test(s1); 
        test(ref1);
        test(291);
	}
}
