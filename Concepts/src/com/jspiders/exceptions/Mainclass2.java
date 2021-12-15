package com.jspiders.exceptions;

import java.sql.SQLException;

public class Mainclass2 
{
    public static void dataBase(String name,long mob,String email)
    throws SQLException
    {
    	if(name.equals("user1"))
    	{
    	  SQLException s1 = new SQLException();
    	  throw s1;
    	}  
    }    
	public static void main(String[] args) 
	{
		System.out.println("main() starts..");
		
		try 
		{
			dataBase("user1",8198289138l,"usr@gmail.com");
			System.out.println("user added");
		} 
		catch (SQLException e) 
		{
			System.out.println("handled SQLException");
			System.out.println("user already exists");
		}
		
		System.out.println("main() ends..");
	}
}




