package com.neotech.review02;

public class ContinueDemo {
	
	public static void main(String[] args) {
		// Task - 5 minutes 
		// i want to celebrate my sons birthdays from 11 to 20 (use for loop )
		// but not 13 th birthday, because we are scared
		//Lets use for loop
		
		for( int  age =11; age<=20; age++ ) {
			
			if(age ==13) {
				continue;
			}
			
			System.out.println("Happy Birthday! You are" + age + " years old");
		}
	}
	
	
	
	

}
