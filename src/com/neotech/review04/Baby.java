package com.neotech.review04;

public class Baby {
	// variables/ attributes / properties
	String name;
	char gender;
	int weight;
	String hairColor;
	
	// methods / behavior / actions 
	void talk () {
		System.out.println("Baby is talking ");
	}
	void eat () {
		System.out.println("Baby is eating ");
	}
	void cry() {
		System.out.println("Baby is crying");
	}
	void displayInformation() {
		System.out.println(name + ", gender is "+ gender +", weight is "+ weight);
	}

}
