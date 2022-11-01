package com.neotech.review01;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the first number:");
		double d1 = input.nextDouble();
		
		System.out.println("Please enter the second number:");
		double d2 = input.nextDouble();
		
		System.out.println("Please enter the operator( + , - , * ,/ )");
		String operator  = input.next();
		
		if (operator.equals("+")) {
			System.out.println("The result is ->"+ (d1 + d2));
		}else if (operator.equals("-")) {
			System.out.println(" The resukt is ->" + (d1-d2));
		}else if (operator.equals("*")) {
			System.out.println("The result is ->"+ (d1*d2));
		}else if (operator.equals("/")) {
			System.out.println("The result is ->" + (d1/d2));
		}else {
			System.out.println("Invalid operator");
		}
		
		
	}
	
	
}
