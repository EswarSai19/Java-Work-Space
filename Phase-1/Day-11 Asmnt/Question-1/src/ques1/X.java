package ques1;

public interface X {
	void fun1X();
	default void fun2X() {
		System.out.println("Default fun2X in X interface");
	}
	static void fun3X() {
		System.out.println("Static fun3X in X interface");
	}
}
