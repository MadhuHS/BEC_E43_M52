package com.ems.frontend;

import java.util.List;

import com.ems.entities.Department;
import com.ems.entities.Employee;
import com.ems.entities.Project;
import com.ems.repositories.DepartmentRepository;
import com.ems.repositories.EmployeeRepository;
import com.ems.repositories.ProjectRepository;

public class Mainclass 
{
	static EmployeeRepository er = new EmployeeRepository();
	static DepartmentRepository dr = new DepartmentRepository();
	static ProjectRepository pro = new ProjectRepository();
	
	public static void testOneToOne()
	{
		Employee e1 = new Employee();
		e1.setEmpno(0);
		e1.seteName("Miller");
		e1.setJob("SSE");
		e1.setSal(68182.123);
		e1.setMob(9876543210l);
		
		Department d1 = new Department();
		d1.setDeptNo(10);
		d1.setdName("DEV");
		d1.setLoc("GOA");
		
		e1.setDept(d1);//linking EMP--->DEPT
		
		er.insert(e1);
	}
	
	public static void testGetEmployee()
	{
	   Employee e1 = (Employee) er.selectOne(50);	
	   
	   System.out.println("Name  : "+e1.geteName());
	   System.out.println("Empno : "+e1.getEmpno());
	   System.out.println("JOB   : "+e1.getJob());
	   System.out.println("SAL   : "+e1.getSal());
	   
	   Department d1 = e1.getDept();
	   
	   System.out.println("LOC        : "+d1.getLoc());
	   System.out.println("Department : "+d1.getdName());
	   
	}
	
	public static void testOneToMany()
	{
	   /*Department d1 = new Department(10,"DEV","GOA");
	   dr.insert(d1);
	   
	   Project p1 = new Project("PR01","MS","12-3-2021","12-3-2022","Project one");
	   pro.insert(p1);*/
	   
	   Department d2 = (Department)dr.selectOne(10);
	   Project p2 = new Project("PR02","Infosys","12-3-2021","12-3-2022","Project two");
	   
	   List<Project> projectList = d2.getProjectList();
	   projectList.add(p2);
	   
	   dr.update(d2);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Program starts...");
		
		//testGetEmployee();
	    testOneToMany();
		
		System.out.println("Program ends...");
	}
}
