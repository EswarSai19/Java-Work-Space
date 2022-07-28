package com.prime;

public class PrimeFact {

	public static void main(String[] args) {
		// Please enter number in the range of 2 to 100
		int num = 100;
		if(num<2 || num>100) {
			System.out.println("Invalid Number");
		}else {
			for(int i=1; i<=num; i++) {
				if(num%i==0) {
					System.out.println(i);
				}
			}
		}

	}

}
