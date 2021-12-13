package com.jspiders.encapsulation;

public class Customer {

	private int applicationId;
	private String applicantName; 
	private String dateOfBirth; 
	private String maritalStatus; 
	private long mobile; 
	private int countOfDependents;
	private String email;
	
	public Customer()
	{
		super();
	}

	public Customer(int applicationId, String applicantName, String dateOfBirth, String maritalStatus, long mobile,
			int countOfDependents, String email) {
		super();
		this.applicationId = applicationId;
		this.applicantName = applicantName;
		this.dateOfBirth = dateOfBirth;
		this.maritalStatus = maritalStatus;
		this.mobile = mobile;
		this.countOfDependents = countOfDependents;
		this.email = email;
	}



	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public int getCountOfDependents() {
		return countOfDependents;
	}

	public void setCountOfDependents(int countOfDependents) {
		this.countOfDependents = countOfDependents;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
