package com.greatlearning.javafsd.emailapp.test;

import com.greatlearning.javafsd.emailapp.CredentialServiceImpl;
import com.greatlearning.javafsd.emailapp.Employee;

public class CredentialServiceImplTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				
		
		testEmailAddressGeneration();
		
		
}
		
	static void testEmailAddressGeneration() {   
		
		CredentialServiceImpl credentialService = new CredentialServiceImpl();
		
		Employee anagh = new Employee("anagh", "samui","tech");
		
		String emailAddress = credentialService.generateEmailAddress(anagh);
		
		System.out.println(emailAddress);
		 
		
    }
	
	
}
	


