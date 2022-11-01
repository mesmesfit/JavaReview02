
package com.neotech.review02;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		// ASk the user to enter a positive number and add it to the total
		// user should enter -1 to Stop.-1 will not be added to the total
		
		Scanner scan = new Scanner(System.in);
		
		int num=0 ;
		int total=0;
	//	
	//	System.out.println("Please enter a positive number! to Stop enter-1");
	//	
		//num = scan.nextInt();
	//	
	//	while ( num!= -1) {
	//		total=total+num;
	//		
	//		System.out.println("Please enter a positive number! to Stop enter-1");
	//		
	//		num = scan.nextInt();
	//	}
	//	System.out.println(" Total = "+ total);
			//	do {
			//		System.out.println("please enter a positive number! to stop -1 enter");
			//		num=scan.nextInt();
			//		if ( num != -1) {
			//			total+=num;
			//		}
					
			//	}while(num!=-1);
		
		//System.out.println("Total ="+ total);
		System.out.println("please enter a positive number! to stop -1 enter");
		num=scan.nextInt();
		
		for (;num!=-1;) {
			total+= num;
			System.out.println("please enter a positive number! to stop -1 enter");
			num = scan.nextInt();
			
			
			
		}
		System.out.println("Total= "+ total);
	}
}

