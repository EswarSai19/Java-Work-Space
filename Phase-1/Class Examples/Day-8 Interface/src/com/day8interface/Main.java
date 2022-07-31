package com.day8interface;

public class Main implements Intr {

	@Override
	public void funX() {
		System.out.println("I am in funX of Main");
		
	}

	@Override
	public void funY() {
		System.out.println("I am in funY of Main");
	}
	
	public static void main(String[] args) {
		System.out.println(args.length);
//		Main m1 = new Main();
//		m1.func1();		// Default functions are automatically implemented.
//		Intr.func2(); //Only static function can call like this.
	}
}
