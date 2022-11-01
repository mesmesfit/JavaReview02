package com.neotech.review04;

public class SubstringDemo {
	public static void main(String[] args) {
		
		String longStr = "I am very happy today because today is not Monday";
		String anotherStr = longStr.substring(4, 7);
		System.out.println(anotherStr);
		
		String anotherStr2 = longStr.substring(4);
		System.out.println(anotherStr2);
		
		System.out.println("longStr-> "+ longStr); // No Change
		
		longStr = longStr.substring(10); // re - assinging 
		System.out.println("longStr -> "+ longStr);
	}

}
