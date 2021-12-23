package com.jspiders.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DbOpts 
{
	private String dbUrl = "jdbc:mysql://localhost:3306";
	private String dbUser = "root";
	private String dbPwd = "root";
	private Connection con = null;

	public void openConnection() throws SQLException 
	{
		// Step1
		con = DriverManager.getConnection(dbUrl, dbUser, dbPwd);
		System.out.println("connected to Mysql DB");
	}

	public void closeConnection() throws SQLException 
	{
		con.close();
		System.out.println("Disconnected from Mysql DB");
	}
}

public class Mainclass2 
{
	public static void main(String[] args) 
	{
        DbOpts db1 = new DbOpts();
        
        try
        {
           db1.openConnection();
           db1.closeConnection();
        }
        catch (SQLException sqlex) 
        {
			sqlex.printStackTrace();
		}
	}
}







