package org.lessons.java.security;

import java.time.LocalDate; //date organizer
import java.time.format.DateTimeFormatter; //date formatter
import java.util.Scanner; //type scanner 

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner noteDown = new Scanner(System.in); //scanner assignment
		
		//name & surname & color
		System.out.println("Please type your Name:");
		String userName = noteDown.nextLine();
		
		System.out.println("your Surname:");
		String userSurname = noteDown.nextLine();

		System.out.println("your favorite Color:");
		String userColor = noteDown.nextLine();
		
		//birthday day+month+year
		int i = 0;
		while (i != 1) {
			System.out.println("your Birthday dd/mm/yyyy:");
			String userBirth = noteDown.nextLine();
			try {
			   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		       LocalDate userBirthday = LocalDate.parse(userBirth, formatter);
		       
		       String[] parts = String.valueOf(userBirthday).split("-");
		       String userDay = parts[0];
		       String userMonth = parts[1]; 
		       String userYear = parts[2];
		       
		    i = 1;
					
		    //password
			System.out.println("Your NotSure password: " + userName + "-" + userSurname + "-" + userColor + "-" + userDay + "-" + userMonth + "-" + userYear);
		    
			} catch (Exception e) {  //generic exception management
			    
				System.out.println("Something went wrong, please retype your date of birth,");
		      }	
		}
	}

}
