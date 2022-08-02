package ques1;

public interface Y {
	void fun1Y();
	default void fun2Y() {
		System.out.println("Default fun2Y in Y interface");
	}
	static void fun3Y() {
		System.out.println("Static fun3Y in Y interface");
	}
}
