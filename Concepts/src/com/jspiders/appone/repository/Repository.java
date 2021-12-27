package com.jspiders.appone.repository;

import java.sql.SQLException;
import java.util.ArrayList;

import com.jspiders.appone.entities.User;

public interface Repository {

	public User selectOne(String value)throws SQLException;
	
	public void selectAll()throws SQLException;
	public void insert(ArrayList<String> values);
	public void update(String value);
	public void delete(String value);
}
