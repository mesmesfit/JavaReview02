package com.neotech.review05;

public class SplitDemo {
	public static void main(String[] args) {
		
		
		String longStr = " I am  very happy today , because today is not Monday!";
		
		String [] strArray = longStr.split("today");
		
		System.out.println(strArray.length);
		
		System.out.println("-----Iterating using Enhanced for loop -------");
		
		for ( String element: strArray) {
			System.out.println(element);
		}
		
		System.out.println("-------- Iterating using Normal for loop -----");
		
		for( int i=0;i<strArray.length; i++)
		{
			System.out.println(strArray[i]);
		}
		
		System.out.println("---------------------------------------");
		longStr = " I like number 5 and 6 because 7 ate 9 ";
		
		
	}

}
