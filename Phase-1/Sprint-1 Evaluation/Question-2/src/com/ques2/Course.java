package com.ques2;

import java.util.Scanner;

public class Course {
	 int courseId;
	 String courseName;
	 int courseFee;
	
	
	
	void displayCourseDetails(int cid, String cname,int cfee) {
		System.out.println("Course Id : "+cid);
		System.out.println("Course Name : "+cname);
		System.out.println("Course Fee : "+cfee);
	}
	static void authenticate(String username, String password) {
		if(username=="Admin" && password=="1234") {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Course Name : ");
			String courseName = scan.nextLine();
			
			System.out.println("Enter Course Id : ");
			int courseId = scan.nextInt();
			
			System.out.println("Enter Course Fee : ");
			int courseFee = scan.nextInt();
			scan.close();
			Course c1 = new Course();
			c1.displayCourseDetails(courseId,courseName,courseFee);
		}else {
			System.out.println("Invalid Username or Password");
		}
	}
	public static void main(String[] args) {
		
		authenticate("Admin", "1234");
		authenticate("Admin", "123");
		
	}
}
