package com.greatlearning.javafsd.emailapp;

public class Employee {
	
	// Attributes of class, Employee
	private String firstName;
	private String lastName;
	private String departmrnt;
	private String emailAddress;
	private String password;
	
	
	//Parameterized Constructor of Class,Employee
	
	public Employee(String firstName, String lastName, String department){
		
		// The Keyword,'this' refers to the same  variables of the Class, Employee
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.departmrnt = department;
		
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartmrnt() {
		return departmrnt;
	}

	public void setDepartmrnt(String departmrnt) {
		this.departmrnt = departmrnt;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
