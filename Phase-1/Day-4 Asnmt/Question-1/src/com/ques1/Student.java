package com.ques1;

public class Student {
	JavaBeans data = new JavaBeans();
	public Student(){
		data.setAge(23);
		data.setMarks(400);
		data.setName("Eswar");
		data.setRoll(19);
		System.out.println("I am in empty constructor");
		System.out.println("Roll No. " +data.getRoll());
		System.out.println("Name " +data.getName());
		System.out.println("Age " +data.getAge());
		System.out.println("Marks " +data.getMarks());	
	}
	public Student(int roll, int marks, int age, String name){
		System.out.println("Valid constructor");
		System.out.println(roll);
		System.out.println(marks);
		System.out.println(age);
		System.out.println(name);	
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student(s1.data.getRoll(),s1.data.getMarks(),
				s1.data.getAge(),s1.data.getName());

		
	}
}
