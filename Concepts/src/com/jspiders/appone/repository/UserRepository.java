package com.jspiders.appone.repository;

import java.sql.SQLException;
import java.util.ArrayList;

public class UserRepository extends RepoUtils implements Repository {

    //NON-STATIC BLOCK : OPen the connection to user repo
	{
		try 
		{
			openConnection();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void selectOne(String value) throws SQLException
	{
		
	}

	@Override
	public void selectAll() 
	{
		

	}

	@Override
	public void insert(ArrayList<String> values) 
	{
		
	}

	@Override
	public void update(String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String value) {
		// TODO Auto-generated method stub

	}

}
