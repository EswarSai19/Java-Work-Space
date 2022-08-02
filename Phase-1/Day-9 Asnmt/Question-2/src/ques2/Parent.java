package ques2;

import java.util.Scanner;

public class Parent {
	int num;
	void method1() {
		System.out.println("this Method-1 belongs to Parent");
		
	}
	final void method2() {
		System.out.println("this Method-2 belongs to Parent");	
	}
	void method3() {
		System.out.println("this Method-3 belongs to Parent");
	}
	final int x = 140;
}

final class Child extends Parent{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number in the range of 1 to 10");
		int enNum =sc.nextInt();
		sc.close();
		Parent p1 = new Child();
		if(enNum<=10 && enNum>=1) {
			p1.num = enNum;
		}else {
			System.out.println("Invalid Number");
		}
		
		Child c1 = (Child)p1;
		c1.method1();
		c1.method2();
		c1.method3();
		c1.method4();
	}
	
	
	@Override
	void method1() {
		System.out.println("this Method-1 belongs to Child");
		System.out.println("Parent variable num is :"+num);
	}
	
	@Override
	void method3(){
		System.out.println("this Method-3 belongs to Child");
	}
	void method4(){
		System.out.println("this Method-4 belongs to Child");
	}
}
