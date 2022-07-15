package com.brigelabz;

import java.util.Scanner;

public class contact {

	public static void address() {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter your first name");
		String firstName=sc.next();
		
		System.out.print("Enter your last name");
		String lastName=sc.next();
		
		System.out.print("Enter Address");
		String address=sc.next();
		
		System.out.print("Enter zip code");
		int zipcode=sc.nextInt();
		
	
		System.out.print("Enter Phone number");
		long phoneNumber=sc.nextLong();
		
			
		
		
		System.out.println("First Name " +firstName);
		System.out.println("last Name " +lastName);
		System.out.println("Address " +address);
		System.out.println("Zip code " +zipcode);
		System.out.println("phone number " +phoneNumber);
		
	}
	public static void main(String[] args) {
		System.out.println("Address Book");
		address();
	}
}

