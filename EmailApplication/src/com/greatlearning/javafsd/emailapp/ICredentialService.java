package com.greatlearning.javafsd.emailapp;

public interface ICredentialService {
	
	  
	
    String generatePassword(Employee employee);
    
     // It generates email address for a particular employee taking input Employee-object as an argument .
    
     // And as it supplies the generated email address, so the return type of this method is String.
    
	String generateEmailAddress(Employee employee);
	
	// It displays the credentials for a particular employee taking input Employee-object as an argument.
	
	// As it is not supplying anything, so it's return type is void.
	
	void displayCredentials(Employee employee);
	
	
}
