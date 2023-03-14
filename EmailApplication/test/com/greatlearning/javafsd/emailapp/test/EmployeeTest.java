package com.greatlearning.javafsd.emailapp.test;

import com.greatlearning.javafsd.emailapp.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		
		// Object (santonu) creation with the help of Parameterized Constructor of the class, Employee
		
		Employee santonu = new Employee("Santonu","Samui","Technical");
		
		// Testing of getters methods
		
		System.out.println(santonu.getFirstName()+ " " +santonu.getLastName()+ 
				          " is Of " + santonu.getDepartmrnt()+ " Department.");
		
		System.out.println();
		
		// Testing of setters methods
		
		santonu.setDepartmrnt("Admin");
		santonu.setFirstName("Nirmal");
		santonu.setLastName("Guha");
		
		System.out.println(santonu.getFirstName()+ " " +santonu.getLastName()+ 
		          " is Of " + santonu.getDepartmrnt()+ " Department.");
		
		
	}

}
