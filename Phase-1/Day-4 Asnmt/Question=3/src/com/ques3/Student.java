package com.ques3;

public class Student {
	int roll;
	String name;
	String address;
	String collegeName;
	public Student() {
		this.roll = 55;
		this.name = "Krishna";
		this.address = "Andhra";
	}
	public Student(int roll, String name, String address){
		System.out.println("Roll No. ="+roll);
		System.out.println("Name is ="+name);
		System.out.println("Address is ="+address+"\n");
		
	}
	public Student(int roll, String name,String collegeName, String address){
		System.out.println("Roll No. = "+roll);
		System.out.println("Name is = "+name);
		System.out.println("Address is = "+address);
		System.out.println("College Name = "+collegeName+"\n");
	}
	public static Student getStudent(boolean isNit) {
		if(isNit==true) {
			Student s1 = new Student(91,"Eswar","India");
			return s1;
		}else {
			Student s2 = new Student(91,"Eswar","LBRCE","India");
			return s2;
		}
			
		}
	public static void main(String[] args) {
//		Student st1 = new Student();
//		st1.getStudent(true);
//		st1.getStudent(false);
		getStudent(true);
		getStudent(false);
	}
	
}
