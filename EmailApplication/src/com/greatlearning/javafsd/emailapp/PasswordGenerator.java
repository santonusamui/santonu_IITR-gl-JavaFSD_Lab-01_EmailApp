package com.greatlearning.javafsd.emailapp;

import java.util.Random;

public class PasswordGenerator {
	
	public String generate() {
		
		String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCase = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%&*()[]-_";
		
		
		String combinedString = 
				upperCase + lowerCase +specialCharacters + numbers;
		
		Random randomObj = new Random();

		StringBuilder passwordBuilder = new StringBuilder();
					
		
		for (int index =1; index<10; index++) {
			
			int length = combinedString.length();
//			System.out.println("Length ->" + length);
			
			int randomIndex = randomObj.nextInt(length);
//			System.out.println("Random Index ->" + randomIndex);

			char charValue = 
					combinedString.charAt(randomIndex);
			
		   // System.out.println("Char Value ->" + charValue);


			passwordBuilder.append(charValue);						
		}

		String password = passwordBuilder.toString();
		
		
				
		return password;
		
	}

}
