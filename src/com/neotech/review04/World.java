package com.neotech.review04;

public class World {
	public static void main(String[] args) {
		
		Baby baby1 = new Baby();
		
		baby1.name = "Mesmes";
		baby1.weight = 18;
		baby1.hairColor = "Brown";
		baby1.gender= 'M';
		System.out.println("The name of baby is "+baby1. name);
		System.out.println("The hair color of baby is "+ baby1.hairColor);
		
		System.out.println("------------------");
		
		Baby baby2 = new Baby();
		baby2.name= "Izmir";
		baby2.gender = 'M';
		baby2.hairColor="Red";
		baby2.weight = 10;
		
		System.out.println("The hair color is "+baby1.hairColor);
		System.out.println("The hair color is "+ baby2.hairColor);
		System.out.println("-------------------");
		
		baby1.cry();
		baby2.cry();
		
		
		baby1.talk();
		System.out.println(" -------------------- ");
		
		baby1.displayInformation();
		baby2.displayInformation();
		
		 
		
	}

}
