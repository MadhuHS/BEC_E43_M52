package com.ems.repositories;

public interface Repository {

	public void insert(Object obj);
	public void update(Object obj);
	public void delete(Object obj);
	public Object selectOne(Object id);
}
