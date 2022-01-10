package com.ems.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "project")
public class Project {

	@Id
	@Column(length = 20)
	String prID;

	@Column(length = 20, nullable = false)
	String prName;

	@Column(length = 20, nullable = false)
	String prDos;

	@Column(length = 20, nullable = false)
	String prDoe;

	@Column(length = 45, nullable = false)
	String prDescp;

	public Project()
	{
		
	}
	public Project(String prID, String prName, String prDos, String prDoe, String prDescp) {
		super();
		this.prID = prID;
		this.prName = prName;
		this.prDos = prDos;
		this.prDoe = prDoe;
		this.prDescp = prDescp;
	}
	
	
}
