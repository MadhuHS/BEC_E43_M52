package com.jspiders.appone.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jspiders.appone.entities.User;

public class UserRepository 
extends RepoUtils 
implements Repository {

	String selectUserQuery = "select * from AppUsers.Users where email = ?";
	String selectAllUsersQuery = "select * from AppUsers.Users";
	String insertUser = "insert into Appusers.Users values (?,?,?,?);";
	
	String userUpdateQuery = 
	"update Appusers.users set name = ?,email = ?,mob = ? where email = ? " ;

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
	public List<User> selectAll() throws SQLException 
	{
		
		PreparedStatement pm = con.prepareStatement(selectAllUsersQuery);
		ResultSet rs = pm.executeQuery();
		
		List<User> userList = new ArrayList<User>();

		while (rs.next() == true) {

			int     uid = rs.getInt("UID");
			String name = rs.getString("Name");
			String email = rs.getString("Email");
			String mob = rs.getString("mob");
			
			User usr = new User(uid,name,email,mob);
			
			userList.add(usr);	
			//System.out.println(uid + " " + name + " " + email + " " + mob);
		}

		closeConnection();
		
		return userList;

	}

	@Override
	public int insert(List<String> values)throws SQLException
	{
      PreparedStatement ps  = con.prepareStatement(insertUser);
      
      ps.setInt(1,0);
      ps.setString(2, values.get(0));
      ps.setString(3, values.get(1));
      ps.setString(4, values.get(2));
      
      int count = ps.executeUpdate();//DML
      
      return count;
	}

	@Override
	public int update(List<String> values,String condition) throws SQLException {
		
		System.out.println("user update()");
		
		PreparedStatement ps  = con.prepareStatement(userUpdateQuery);
	      
	      ps.setString(1, values.get(0));//name
	      ps.setString(2, values.get(1));//email
	      ps.setString(3, values.get(2));//mob
	      ps.setString(4, condition);//currEmail
	      
	      System.out.println(ps);
	      
	      int count = ps.executeUpdate();//DML
	      
	      return count;
	}

	@Override
	public void delete(String value) {
		// TODO Auto-generated method stub

	}

}
