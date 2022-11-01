package com.neotech.review04;

public class Method {
	
	void sayWelcome() {
		
		for ( int i =1 ; i<=3; i++) {
			System.out.print("Welcome,");
		}
		System.out.println();
	}
		void sayWelcomeWithNumber(int n) {
			for ( int i =1;i<=n;i++) {
				System.out.println();
			}
		} void sayGreeting (String greeting) {
			for (int i =1 ; i<=3;i++) {
				System.out.println(greeting);
			}
			System.out.println();
		
	
	
	}
		
    public static void main(String[] args) {
	Method m = new Method();
	m.sayWelcome();
	m.sayWelcomeWithNumber(3);
	m.sayGreeting("Merhaba");
	 
    
    }
	
	
}
