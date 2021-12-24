package com.jspiders.appone.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class RepoUtils 
{
    String dburl  = "jdbc:mysql://localhost:3306/appusers";
    String dbUser = "root";
    String dbPwd  = "root";
    Connection con = null;
   
   void openConnection()throws SQLException
   {
	 if(con!=null)
	 {
	   con = DriverManager.getConnection(dburl,dbUser,dbPwd);  
	 }
   }
   
   void closeConnection()throws SQLException
   {
	  con.close(); 
   }
}
