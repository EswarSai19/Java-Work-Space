package ques1;

public class Student {
	private int roll;
	private String name; 
	private String address;
	private int marks;
	

	public Student(String name2, int roll2, int marks2,String address2) {
		this.setName(name2);
		this.setRoll(roll2);
		this.setName(name2);
		this.setAddress(address2);
		System.out.println("Student Details are :"+"\n");
		System.out.println("Name is :"+getName());
		System.out.println("Roll is :"+getRoll());
		System.out.println("Address is :"+getAddress());
		System.out.println("***************************");
	}
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
}
