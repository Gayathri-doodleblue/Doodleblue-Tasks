package com.example.emp.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "emp")
public class Employee {

	@Id
	@GeneratedValue
	private int id;
	@Column
	private String name;
//	@Column
//	
//	  private int age;
	  
//	  @Column private String department;
//	  
//	  @Column private float salary;
	 
    
	public Employee() {

	}

	public Employee(int id, String name /* ,String department,float salary */ ) {
		//super();
		this.id = id;
		this.name = name;
		
//		   this.department=department;
//		  
//		  this.salary=salary;
		 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



//  public int getAge() { return age; }
//  
//  public void setAge(int age) { this.age = age; }
//  
//  public String getDepartment() { return department; }
//  
//  public void setDepartment(String department) { this.department = department;
//  }
//  
//  public float getSalary() { return salary; }
//  
//  public void setSalary(float salary) { this.salary = salary; }
  
  }
 