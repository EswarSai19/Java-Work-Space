package ques1;

import java.util.Scanner;

public class AllStudents {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Science Student Details...");
		System.out.println("================================\n");
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Address : ");
		String add = sc.nextLine();
		System.out.println("Enter Physics Marks : ");
		int phmarks = sc.nextInt();
		System.out.println("Enter Chemistry Marks : ");
		int chemarks = sc.nextInt();
		System.out.println("Enter Maths Marks : ");
		int mathmarks = sc.nextInt();
		Student sci1 = new ScienceStudent(name, add, phmarks,chemarks, mathmarks);
		sci1.getPercentage();
		System.out.println("Enter History Student Details...");
		System.out.println("================================\n");
		System.out.println("Enter Name : ");
		sc.nextLine();
		String name2 = sc.nextLine();
		System.out.println("Enter Address : ");
		String add2 = sc.nextLine();
		System.out.println("Enter History Marks : ");
		int hismarks = sc.nextInt();
		System.out.println("Enter Civics Marks : ");
		int civmarks = sc.nextInt();
		sc.close();
		Student his1 = new HistoryStudent(name2, add2, hismarks,civmarks);
		his1.getPercentage();
	}
}
