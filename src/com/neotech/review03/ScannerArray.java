package com.neotech.review03;

import java.util.Scanner;

public class ScannerArray {
	public static void main(String[] args) {
		// Ask the user: How many numbers do you want to store in the array?
		// Ask him to enter the numbers: Read numbers and enter them into the array
		// Print the numbers from the array
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers do you want to store in array?");
		int size = input.nextInt();
		
		// declarin the array
		int[] array = new int[size];
		
		// Read numbers and enter them into the array
		for ( int a = 0; a<size; a++)
		{
			System.out.println("Enter a number: ");
			array[a]=input.nextInt();
		}
		// Print the numbers from the array 
		System.out.println("Lets print the numbers from array:");
		for( int a = 0; a<array.length;a++)
		{
			System.out.print(array[a]+" ");
		}
		System.out.println();
		
		System.out.println(" lets print the numbers using enhanced for loop");
		for(int num:array) {
			System.out.print(num+ " ");
		}
		
	}

}
