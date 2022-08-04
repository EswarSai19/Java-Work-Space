package ques1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of elements in the array");
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("Enter elements in the array");
			for(int i=0; i<size; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println("Enter the index of the array element you want to access");
			String ind = sc.next();
			int indNum = Integer.parseInt(ind);
			System.out.println("The array element at index "+ind +" = "+arr[indNum]);
			sc.close();
			System.out.println("The array element successfully accessed");
		}
		catch(ArrayIndexOutOfBoundsException aiobe) {
			System.out.println(aiobe);
		}
		catch(NumberFormatException nfe) {
			System.out.println(nfe);
		}
		
	}
	
	
	
}
