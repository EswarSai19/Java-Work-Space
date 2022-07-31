package com.collaborate;

public class Demo {
	
		Test a = new Test();
		
		int x = 100;
		Test func(String username, String password) {
			if(username=="admin" && password=="1234") {
				System.out.println("Login Successful");
				return new Test();
			}else {
				return null;
			}
		}
		
		void funcDemo() {
			System.out.println("I am in funcDemo of class Demo");
		}
	public static void main(String[] args) {
		Demo d1 = new Demo();
		Test t1 = d1.func("admin", "123");
		if(t1 != null) {
			t1.funcA();
		}else {
			System.out.println("Invalid username or password");
		}
	}
}
