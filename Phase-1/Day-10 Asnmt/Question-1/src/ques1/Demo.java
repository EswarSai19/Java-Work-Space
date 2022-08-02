package ques1;

import java.util.Scanner;

public class Demo {
	public Hotel provideFood(int amount) {
		if(amount >1000) {
			return new TajHotel();
		}else if(amount>=200 && amount<=1000) {
			return new RoadSideHotel();
		}
		return null;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any amount of more than 200");
		int amt = sc.nextInt();
		sc.close();
		if(amt>=200) {
			Demo d1 = new Demo();
			Hotel h1 = d1.provideFood(amt);
			h1.chickenBiryani();
			h1.masalaDosa();
			if(h1 instanceof TajHotel) {
				TajHotel t1 = (TajHotel)h1;
				t1.welcomeDrink();
			}
		}else {
			System.out.println("Please enter a valid amount");
		}
		
		
	}
}
