package com.neotech.review01;

public class TypeCasting {

	public static void main(String[] args) {	

		// byte < short < int < long < float < double
		
		int intNumber = 50;
		//widening / implicit casting and its done automatically
		double doubleNumber = intNumber;
		System.out.println("intNumber ->" + intNumber);
		System.out.println("doubleNumber->" + doubleNumber);
		
		// narrowing/explicit casting / manually
		byte byteNumber = (byte)intNumber; // it is risky, you may loose the data
		System.out.println("byteNumber->" + byteNumber);
		
		// re-assing 
		intNumber = 670;
		 
		byte b2 =(byte) intNumber;
		// in this case we WILL loose data
		System.out.println("b2-> " + b2);
		
		byte b3 = 90;
		int i3 = b3;
		System.out.println("i3->"+ i3);
		
		// ask the user to enter 2 numbers 
		// ask the user for the operator 
		// solve it using if-else and using switch
		
		
	   
		
	}

}
