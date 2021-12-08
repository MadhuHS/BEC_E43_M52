package com.jspiders.encapsulation;

public class User {
	private String loginId;// read
	private String password;// read
	private String role;// read

	public User() {
		super();
	}

	public User(String loginId, String password, String role) {
		super();
		this.loginId = loginId;
		this.password = password;
		this.role = role;
	}

	// read
	public String getLoginId() {
		return loginId;
	}

	// write
	public void setLoginId(String loginId) 
	{
		if (this.loginId == null) 
		{
			this.loginId = loginId;
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
