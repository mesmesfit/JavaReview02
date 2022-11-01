package com.neotech.review01;

public class VariableDemo {

	public static void main(String[] args) {
		
		
		// declaring a variable 
		String firstName ;
		//System.out.println("My first name is " + firstName); // compile time error..
		// assign a value ( initialize)
		firstName = "Mesut";
		System.out.println("My first name is "+ firstName);
		
		
		// declare a variable &  assign a value 
		String lastName = "Yilmaz";
		
		int age = 28;
		
		System.out.println(firstName + " "+ lastName + " " + age);
		
		// after 5 years 
		// re-assign a new value 
		age = age + 5; //  equals to age + =5;
		lastName = "Aniston";
		System.out.println("After getting married!");
		System.out.println(firstName + " "+ lastName + " " + age);
		
		

	}

}
