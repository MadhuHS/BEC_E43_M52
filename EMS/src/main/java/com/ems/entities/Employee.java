package com.ems.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity(name = "Emp")
public class Employee {
	
	@Id // Primary key
	@GeneratedValue(strategy = GenerationType.AUTO) //Auto increment
	private int empno;
	
	@Column(length = 50,nullable = false)
	private String eName;
	
	@Column(length = 50,nullable = false)
	private String job;
	
	@Column(length = 10,nullable = false,unique = true)
	private long mob;
	
	@Column(nullable = false)
	private double sal;
	
	@OneToOne
	private Department dept;
	
	
	public Employee()
	{
		
	}

	public Employee(int empno, String eName, String job, long mob, double sal,Department  dept) {
		super();
		this.empno = empno;
		this.eName = eName;
		this.job = job;
		this.mob = mob;
		this.sal = sal;
		this.dept = dept;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public long getMob() {
		return mob;
	}

	public void setMob(long mob) {
		this.mob = mob;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}
}






