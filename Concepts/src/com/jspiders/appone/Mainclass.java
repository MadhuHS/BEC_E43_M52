package com.jspiders.appone;

import java.sql.SQLException;

import com.jspiders.appone.repository.UserRepository;

public class Mainclass {

	public static void main(String[] args) 
	{
		try
		{
			UserRepository usr = new UserRepository();
			//usr.selectOne("virat@rcb.com");
			usr.selectAll();
		} 
		catch (SQLException sqlex) 
		{
			sqlex.printStackTrace();
		}

	}

}
