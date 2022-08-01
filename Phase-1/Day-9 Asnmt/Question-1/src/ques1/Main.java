package ques1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.displayDetails();
		System.out.println(s1);
		Student s2 = new Student();
		s2.displayDetails();
		System.out.println(s2);
	}
}
class Student{
	private int roll; 
	private String name;
	private int marks;
	private char grade;
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
	}

	public void displayDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Details...");
		System.out.println("========================\n");
		System.out.println("Enter Name : ");
		String name = sc.next();
		
		System.out.println("Enter Roll Num : ");
		int rollNum = sc.nextInt();
		
		System.out.println("Enter Marks : ");
		int mrks = sc.nextInt();
		sc.close();
		this.roll = rollNum;
		this.name = name;
		this.marks = mrks;

		calculateGrade(mrks);
		
		
	}
	private char calculateGrade(int ma) {

		if(marks>=500) {
			this.grade = 'A';
		}else if(marks<500 && marks>=400) {
			this.grade = 'B';
		}else if(marks<400) {
			this.grade = 'C';
		}	
		return grade;
		
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	
}