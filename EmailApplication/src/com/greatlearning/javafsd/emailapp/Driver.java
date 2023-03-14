package com.greatlearning.javafsd.emailapp;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);

		String firstName = "santonu";
		String lastName = "samui";

		System.out.println("Welcome to Email Application");
		System.out.println("To specify your department, enter the corresponding department number");

		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");


		int departmentOption = input.nextInt();
		String departmentName = "";

		switch (departmentOption) {

			case 1: {
				departmentName = "tech";
				break;
			}
			case 2: {
				departmentName = "admin";
				break;				
			}
			case 3: {
				departmentName = "hr";
				break;				
			}
			case 4: {
				departmentName = "legal";
				break;				
			}

			default : {

				System.out.println("Invalid department option chosen. Please choose a value "
						+ "between 1 and 4");
				System.exit(-1);
			}
		}

		
		
		Employee santonu = new Employee(firstName, lastName,departmentName );
		
		//Employee santonu = new Employee("santonu", "samui","tech" );
		//System.out.println(santonu.getFirstName());
		//santonu.setEmailAddress("s.samui@admin.abc.com");
		//System.out.println(santonu.getEmailAddress());
		
		
		CredentialServiceImpl credentialService = new CredentialServiceImpl();
		
		credentialService.generateEmailAddress(santonu);
		
		
		//System.out.println(emailAddress);
		
		 credentialService.generatePassword(santonu);
		
		//System.out.println(password);
		
		credentialService.displayCredentials(santonu);
		
		

	}

}
