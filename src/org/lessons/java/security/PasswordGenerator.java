package org.lessons.java.security;

import java.time.LocalDate; //date organizer
import java.time.format.DateTimeFormatter; //date formatter
import java.util.Scanner; //type scanner 

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner noteDown = new Scanner(System.in); //scanner assignment
		
		//name & surname & color
		System.out.println("Please type your name:");
		String userName = noteDown.nextLine();
		
		System.out.println("your surname:");
		String userSurname = noteDown.nextLine();

		System.out.println("your favorite color:");
		String userColor = noteDown.nextLine();
		
		//birthday day+month+year
		int i = 0;
		while (i != 1) {
			System.out.println("Please type the day of your birth dd/mm/yyyy:");
			String userBirth = noteDown.nextLine();
			try {
			   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		       LocalDate userBirthday = LocalDate.parse(userBirth, formatter);
		       
		       String[] parts = String.valueOf(userBirthday).split("-");
		       String userDay = parts[0];
		       String userMonth = parts[1]; 
		       String userYear = parts[2];
		       
		    i = 1;
					
		    
			} catch (Exception e) {  //generic exception management
			    
		      }	
		}
	}

}
