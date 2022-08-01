package ques1;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of student objects to be created : ");
		System.out.println("===============================================\n");
		int noOfStu = sc.nextInt();
		Student[] students = new Student[noOfStu];
		double count = 0;
		for(int i=0; i<noOfStu; i++) {
			System.out.println("Enter details of student "+i+1);
			System.out.println("=============================\n");
			System.out.println("Enter Name : ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.println("Enter Address : ");
//			sc.nextLine();
			String address = sc.nextLine();
			
			System.out.println("Enter Roll : ");
			int roll = sc.nextInt();
			
			System.out.println("Enter Marks : ");
			int marks = sc.nextInt();
			
			 students[i] = new Student(name,roll,marks,address);
			 count+= marks;
		}
		System.out.println("Average Marks of Students are "+(count/noOfStu));
	}
}
