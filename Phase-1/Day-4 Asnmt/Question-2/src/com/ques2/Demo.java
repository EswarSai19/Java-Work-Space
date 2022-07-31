package com.ques2;

public class Demo {
	Demo(){
		System.out.println("Empty Demo");
	}
	Demo(int i){
		System.out.println("Integer Demo");	
		}
	Demo(float f){
		System.out.println("Float Demo");
	}
	Demo(String name){
		System.out.println("String Demo");
	}
	public static void main(String[] args) {
		 new Demo("Eswar");
		 new Demo(10);
		 new Demo();
		 new Demo(10.55f);
	}
	
}
