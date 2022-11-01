package com.neotech.review05;

public class FamilyMembers {
	String firstName;
	static String lastName;
	int age ; // 
	
	 void printfullName() {
		 System.out.println("Full name is : " + firstName + " "+ lastName);
		 
	 }
	static void printFamilyName() {
		System.out.println("Family name is: " + lastName);
	}

}
