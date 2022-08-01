package ques2;

public class Parent {
	
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
		Child c1 = new Child();
		c1.method3();
		
	}
	
	@Override
	void method1() {
		System.out.println("this Method-1 belongs to Child");
	}
	@Override
	void method3(){
		System.out.println("this Method-3 belongs to Child");
	}
	void method4(){
		
	}
}
