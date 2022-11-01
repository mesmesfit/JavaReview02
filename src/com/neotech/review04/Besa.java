package com.neotech.review04;

public class Besa {

	void addTwoNumbers() {
		int result = 2 + 5;
	}

	void addTwoNumbersThatIGive(int a, int b) {
		int result = a + b;
	}

	int addTwoNumbersAndGiveMeTheResult() {
		System.out.println("I am inside addTwoNumbersAndGiveMeTheResult");
		int result = 2 + 5;
		return result;
	}

	int addTwoNumbersThatIGiveMeTheResult(int num1, int num2) {
		System.out.println("I am inside addTwoNumbersThatIGiveAndGiveMeTheResult");
		int result = num1 + num2;
		return result;
	}

}
