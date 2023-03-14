package com.greatlearning.javafsd.emailapp;

public class DisplayCredentials {
	
	
	public void display(Employee employee) {
		
		
		 
		StringBuilder messageBuilder = new StringBuilder();
		//CredentialServiceImpl credentialService = new CredentialServiceImpl();
		
		
		messageBuilder.append("Dear ");
		messageBuilder.append(employee.getFirstName());
		messageBuilder.append(", your generated credentials are as follows");

		// \r\n \n
		String newline = System.getProperty("line.separator");
		messageBuilder.append(newline);
		messageBuilder.append("Email        --->  ");
		messageBuilder.append(employee.getEmailAddress());

		messageBuilder.append(newline);
		messageBuilder.append("Password ---> ");
		
		messageBuilder.append(employee.getPassword());

		String finalMessage = messageBuilder.toString();

		System.out.println(finalMessage);
	}

}
