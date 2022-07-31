package com.vowels;

public class VowelsConsonents {
	char vowel='a';
	char consonent;
	
	void function(char ch) {
		byte b = (byte)ch;
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' 
				|| ch=='E' || ch=='I' || ch=='O' || ch=='U') {
			System.out.println("Vowel");
		}else if(b>=65 && b<=122) {
			System.out.println("Consonent");
		}else {
			System.out.println("Not an Alphabet");
		}
		
	}
	public static void main(String[] args) {
		VowelsConsonents c1 = new VowelsConsonents();
		c1.function('a');
		c1.function('S');
		c1.function('*');
	}
}	
