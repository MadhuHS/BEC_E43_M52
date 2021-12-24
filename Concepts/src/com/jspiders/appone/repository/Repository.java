package com.jspiders.appone.repository;

import java.sql.SQLException;
import java.util.ArrayList;

public interface Repository {

	public void selectOne(String value)throws SQLException;
	public void selectAll();
	public void insert(ArrayList<String> values);
	public void update(String value);
	public void delete(String value);
}
