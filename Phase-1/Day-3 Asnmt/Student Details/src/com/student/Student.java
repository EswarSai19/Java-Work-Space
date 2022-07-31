package com.student;

public class Student {
	int roll;
	String name;
	int marks;
	
	void displayStudentDetails(){
		
		System.out.println("ROll is : "+roll);
		System.out.println("Name is : "+name);
		System.out.println("Marks is : "+marks+"\n");
		
		
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.roll = 19;
		s1.name = "Eswar";
		s1.marks = 380;
		s1.displayStudentDetails();
		s1 = null;
		
		s2.roll = 27;
		s2.name = "Tharun";
		s2.marks = 270;
		s2.displayStudentDetails();
		s2 = null;
	}
}
