package com.jspiders.appone.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
	public void selectOne(String value) throws SQLException {
		PreparedStatement pm = con.prepareStatement(selectUserQuery);

		pm.setString(1, value);

		// System.out.println(pm);

		ResultSet rs = pm.executeQuery();// returns ResultSet

		rs.next();// move the cursor to next record

		int uid = rs.getInt("UID");
		String name = rs.getString("Name");
		String email = rs.getString("Email");
		String mob = rs.getString("mob");

		System.out.println(uid + " " + name + " " + email + " " + mob);

		closeConnection();
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
