package com.ques1;

import java.util.Scanner;

public class Main {
	

	public static String reversString(String input){
		String s = "";
		for(int i=input.length()-1; i>=0; i--) {
			s+=input.charAt(i);
		}
		return s;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string that want to reverse");
		String str = sc.next();
		String result = reversString(str);
		System.out.println("Original String is : "+str);
		System.out.println("Reversed String is : "+result);
	}
}
