package com.neotech.review03;

public class ArrayIntro {
	public static void main(String[] args) {
		
		// funny 
	 int a = 6;
	 int b = 4;
	 int c = 9;
	 int d = 2;
	 
	 int sum = a+b+c+d;
		
	 System.out.println("Sum is->"+ sum);
	 
	// 1st serious way 
	  int [] mes = new int [4]; 
	  mes[0] = 6;
	  mes[2] = 9;
	  mes[3] = 2;
	  mes[1] = 4;
	  
	  int sumMes = 0;
	  for(int i =0;i<mes.length;i++)
	  {
		  sumMes = sumMes+mes[i];
	  }
	  
	
	} 
	
	

}
