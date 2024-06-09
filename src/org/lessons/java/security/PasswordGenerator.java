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
			System.out.println("Please type the day of your birth dd/mm/yyyy:");
			String userBirth = noteDown.nextLine();
	}

}
