package com.student;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of student details you want to enter : ");
		int stuNum = sc.nextInt();
		Student[] stu = new Student[stuNum];
		
		for(int i=0; i<stu.length; i++) {
			System.out.println("Enter Student Details of "+(i+1));
			System.out.println("================================");
			System.out.println("Enter Name ");
			String name = sc.next();
			
			System.out.println("Enter Roll ");
			int roll = sc.nextInt();
			
			System.out.println("Enter Marks ");
			int marks = sc.nextInt();
			
			stu[i] = new Student(roll,name,marks);
		}
		
		for(Student student: stu) {
			System.out.println("Name is :"+student.getName());
			System.out.println("Roll is :"+student.getRoll());
			System.out.println("Marks is :"+student.getMarks());
			
			System.out.println("********************************");
		}
	}
}
