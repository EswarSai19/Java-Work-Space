package com.ques4;

public class WholeNumber {
	int input = 45;
	void isEven(int num) {
		if(num%2==1 && num>0) {
			System.out.println(num);
		}else if(num%2==0 && num>0) {
			int x = num%10;
			num = num-x+10;
			System.out.println(num);
		}else {
			System.out.println("Error");
		}
	}
	public static void main(String[] args) {
		WholeNumber n1 = new WholeNumber();
		n1.isEven(n1.input);
		n1.isEven(44);
		n1.isEven(-5);
	}
}
