package com.ems.repositories;

import com.ems.entities.Department;

public class ProjectRepository extends RepoUtils implements Repository {

	public void insert(Object obj) {
		createSession();

		tx = session.beginTransaction();

		session.save(obj);

		tx.commit();

		closeSession();

		System.out.println("Project added");
	}

	public void update(Object obj) {

		createSession();

		tx = session.beginTransaction();

		session.update(obj);

		tx.commit();

		closeSession();

	}

	public void delete(Object obj) {
		// TODO Auto-generated method stub

	}

	public Object selectOne(Object id) {

		createSession();

		tx = session.beginTransaction();

		Department d1 = session.get(Department.class, id);

		tx.commit();

		closeSession();
		return d1;
	}

}
