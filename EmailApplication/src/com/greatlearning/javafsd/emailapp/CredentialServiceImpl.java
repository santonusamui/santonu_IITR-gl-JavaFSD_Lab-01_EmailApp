package com.greatlearning.javafsd.emailapp;

public class  CredentialServiceImpl
		implements ICredentialService{

	@Override
	public String generatePassword(Employee employee) {
		// TODO Auto-generated method stub
		
		PasswordGenerator generator = new PasswordGenerator();
		String password = generator.generate();
		employee.setPassword(password);
		
		return password;
	}

	@Override
	public String generateEmailAddress(Employee employee) {
		// TODO Auto-generated method stub
		
		EmailAddressGenerator generator = new EmailAddressGenerator();
		String emailAddress = generator.generate(employee);
		
		return emailAddress;
	}

	@Override
	public void displayCredentials(Employee employee) {
		// TODO Auto-generated method stub
		
		DisplayCredentials show = new DisplayCredentials();
		
		
		show.display(employee);
		
		
		
		
	}
	
	
	

}
