package com.jspiders.appone.entities;

public class User {

	private int uid;
	private String name;
	private String email;
	private String mob;
	
	public User()
	{
		
	}
	
	public User(int uid, String name, String email, String mob) {
		super();
		this.uid = uid;
		this.name = name;
		this.email = email;
		this.mob = mob;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}
	
	
	
	
}
