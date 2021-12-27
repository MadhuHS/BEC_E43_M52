package com.jspiders.appone.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.jspiders.appone.entities.User;

public class UserRepository 
extends RepoUtils 
implements Repository {

	String selectUserQuery = "select * from AppUsers.Users where email = ?";
	String selectAllUsersQuery = "select * from AppUsers.Users";

	// NON-STATIC BLOCK : OPen the connection to user repo
	{
		try {
			openConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public User selectOne(String value) throws SQLException {
		
		PreparedStatement pm = con.prepareStatement(selectUserQuery);
		User u1 = null;
		ResultSet rs = null;

		pm.setString(1, value);

		// System.out.println(pm);

		rs = pm.executeQuery();// returns ResultSet

		if(rs.next() == true)// move the cursor to next record
		{
		 int    uid = rs.getInt("UID");
		 String name = rs.getString("Name");
		 String email = rs.getString("Email");
		 String mob = rs.getString("mob");
		
		 u1 = new User(uid,name,email,mob);
		}

		//System.out.println(uid + " " + name + " " + email + " " + mob);

		closeConnection();
		
		return u1;
	}

	@Override
	public void selectAll() throws SQLException {
		PreparedStatement pm = con.prepareStatement(selectAllUsersQuery);
		ResultSet rs = pm.executeQuery();

		while (rs.next() == true) {

			int uid = rs.getInt("UID");

			String name = rs.getString("Name");
			String email = rs.getString("Email");
			String mob = rs.getString("mob");

			System.out.println(uid + " " + name + " " + email + " " + mob);
		}

		closeConnection();

	}

	@Override
	public void insert(ArrayList<String> values) {

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
