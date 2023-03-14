package com.greatlearning.javafsd.emailapp;

public class EmailAddressGenerator {
	
	
	  public String generate(Employee employee) {
		  
		  
		  //Employee employee = new Employee("santonu", "samui", "admin");
		  
		  
		  //email address structure is like firstname.lastname@depatmentname.companyname.com
			
			String firstName = employee.getFirstName();
			
			String lastName = employee.getLastName();
			
			String department = employee.getDepartmrnt();
			
			//Concatenate Strings.
			StringBuilder emailBuilder = new StringBuilder();
			
			emailBuilder.append(firstName);
			
			emailBuilder.append(".");
			
			emailBuilder.append(lastName);
			
			emailBuilder.append("@");
			
			emailBuilder.append(department);
			
			emailBuilder.append(".");
			
			emailBuilder.append("abc.com");
			
			String emailAddress = emailBuilder.toString();
			employee.setEmailAddress(emailAddress);
			
			 return emailAddress;
	  }
	 
	  

}
