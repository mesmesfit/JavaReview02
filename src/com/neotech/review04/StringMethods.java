package com.neotech.review04;

public class StringMethods {
	public static void main(String[] args) {
		
		String str = "hello";
		System.out.println(str.length());
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		System.out.println(str);// The original ha not changed
		 
		boolean equal = str.equals("hello");
		System.out.println(equal);
		
		System.out.println(str.equalsIgnoreCase("hello"));
		System.out.println("------------------");
		
		System.out.println(str.contains("SH"));
		System.out.println(str.contains("SH".toLowerCase()));
		
		boolean starts = str.startsWith("h");
		System.out.println(starts);
		
		System.out.println("Does hello start with hel?");
		System.out.println(str.startsWith("hel"));
		
		System.out.println("Does hello start with hello?");
		System.out.println(str.startsWith("hello"));
		
		System.out.println("------------------");
		
		
		String name= "Messmes"+"-"+ "Yilmaz";
		System.out.println(name);
		
		String name2 = "Messmes".concat("-").concat("Yilmaz"); // method chaning
		System.out.println(name2);
		
		String name3 = "Messmes".toUpperCase().concat("-").concat("Yilmaz");
		System.out.println(name3);
		
		System.out.println("Messmes".length()+3);
		System.out.println("------------");
		
		String str2 = "  Kemal   Ataturk  ";
		
		System.out.println(str2.trim());
		System.out.println(str2.trim().length());
		
		System.out.println("--------------");
		
		String str3 = " Nefes Vatan";
		char letter = str3.charAt(3);
		System.out.println(letter);
		
		System.out.println(str3.indexOf('s'));
		
		
	}

}
