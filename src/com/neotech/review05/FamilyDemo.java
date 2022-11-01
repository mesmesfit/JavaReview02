package com.neotech.review05;

public class FamilyDemo {
public static void main(String[] args) {
	
	
	FamilyMembers.lastName= "James";
	
	
	
	FamilyMembers.printFamilyName();
	
	
	System.out.println("-----------------------");
	FamilyMembers mm1 = new FamilyMembers ();
	
	mm1.firstName="Lebron";
	
	mm1.age =35;
	
	
	FamilyMembers mm2 =new FamilyMembers();
	
	mm2.firstName= "Savvannah";
	mm2.age=32;
	
	mm1.printfullName();
	mm2.printfullName();
	
	System.out.println("-----------------------");
	System.out.println(" They wanto hgafhgdshakhaosfhgao");
	
	FamilyMembers.lastName="Brown";
	mm1.firstName="King Lebron";
	
	
	
	mm2.printfullName();
	mm1.printfullName();
	
	
	FamilyMembers baby = new FamilyMembers ();
	baby.firstName="bebek";
	System.out.println(baby.firstName);
	
	System.out.println(FamilyMembers.lastName);
	
	
		
	
}
}
