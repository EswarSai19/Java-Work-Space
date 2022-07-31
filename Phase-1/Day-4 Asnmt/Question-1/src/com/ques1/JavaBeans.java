package com.ques1;

public class JavaBeans {
	private String name;
	private int roll;
	private int age;
	private int marks;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		if(age>=18 && age<=60)
			this.age = age;
		else
			this.age = 0;
	}
	public int getAge() {
		return age;
	}
	
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		if(marks>0 && marks<500)
			this.marks = marks;
		else
			this.marks = 0;
		
	}
	
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getRoll() {
		return roll;
	}
}
