package com.jspiders.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mainclass {
	public static void main(String[] args) {

		String dbUrl = "jdbc:mysql://localhost:3306";
		String dbUser = "root";
		String dbPwd = "root";
		Connection con = null;

		try 
		{
			// Step1
			con = DriverManager.getConnection(dbUrl, dbUser, dbPwd);
			System.out.println("connected to Mysql DB");

		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		} 
		finally 
		{
			try 
			{
				// Step5 : close
				con.close();
				System.out.println("Disconnected from Mysql DB");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
