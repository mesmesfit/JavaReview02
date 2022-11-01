package com.neotech.review04;

public class School {
	public static void main(String[] args) {
		
		
		Student student1 = new Student();
		student1.name = "Mesmes";
		student1.studentNr=358;
		student1.gradeLevel=10;
		
		
		Student student2 = new Student();
		student2.name = "Meg";
		student2.studentNr = 422;
		student2.gradeLevel = 4;
		
		Teacher teacher = new Teacher();
		teacher.name="Sabah";
		teacher.salary=2222222;
		teacher.subject="Java";
		
		System.out.println("Lets call the methods");
		
		
		student1.study();
		
		student2.sleep();
		student2.study();
		
		teacher.teach();
		teacher.yellAtstudent(student2.name);
		
	}

}
