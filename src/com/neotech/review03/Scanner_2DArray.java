package com.neotech.review03;

import java.util.Scanner;

public class Scanner_2DArray {
	public static void main(String[] args) {
		       // Create the array( String[] [] names)
				// fill the array
				// Print the array
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many rows do you want in the array?");
		int rows =input.nextInt();
		
		System.out.println("How many columns do you want in the array?");
		int cols = input.nextInt();
		
		
		String[][] names = new String[rows][cols];
		
		for( int a= 0; a < rows; a++) {
			for(int b = 0;b < cols; b++) {
				System.out.println("Please enter something for "+ a + " "+ b);
				names[a][b]= input.next();
			}
		}
		System.out.println("---------------------------");
		for( int a =0; a < rows; a++) {
			for ( int b = 0; b< cols; b++) {
				System.out.print(names[a][b]+ " ");
			}
			System.out.println();
		}
		
		
		
		
	
		
	}

}
