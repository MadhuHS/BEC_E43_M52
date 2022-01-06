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
}
