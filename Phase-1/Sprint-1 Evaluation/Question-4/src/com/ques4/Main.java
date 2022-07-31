package com.ques4;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Main m1 = new Main();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number of Students You Want to Add");
		int noofstudents = scan.nextInt();
		
		for(int i=0; i<noofstudents; i++) {
			
			System.out.println("Enter Roll Number : ");
			int rollno = scan.nextInt();
			System.out.println("Enter marks : ");
			int marks = scan.nextInt();
			System.out.println("Enter Student Name : ");
			String name = scan.nextLine();
			JavaBean s1 = new JavaBean(name,rollno,marks);
		}
		scan.close();
		
	}
}
