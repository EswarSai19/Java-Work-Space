package ques3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of passengers : ");
		int noOfPass = sc.nextInt();
		System.out.println("Enter number of Kilometers : ");
		int noOfKm = sc.nextInt();
		sc.close();
		OLA myOla = new OLA();
		Car myCar = myOla.bookCar(noOfPass, noOfKm);
		int res = myOla.calculateBill(myCar);
		System.out.println(res);
		
	}
}
