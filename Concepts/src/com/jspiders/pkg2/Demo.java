package com.jspiders.pkg2;

//Access Specifiers
public class Demo 
{
    public    int    v1 = 109;
    protected double v2 = 7162.17;
              long   v3 = 98198298312l;
    private   String v4 = "jspiders";
    
    public void test1()
    {
    	System.out.println("this is public-test1() of Demo class");
    }
    
    protected void test2()
    {
    	System.out.println("this is protected-test2() of Demo class");
    }
    
    void test3()
    {
    	System.out.println("this is pkg-level-test3() of Demo class");
    }
    
    private void test4()
    {
    	System.out.println("this is private-test4() of Demo class");
    }
}
