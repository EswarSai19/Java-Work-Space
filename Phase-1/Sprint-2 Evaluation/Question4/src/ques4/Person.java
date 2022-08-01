package ques4;

public class Person {
	
	String name;
	String gender;
}
class Address{
	String city;
	String state;
	String pinCode;
}
class Instructor extends Person{
	int instructorId;
	int salary;
	Address address;
	public Instructor(){
		this.name = "Vijayendra";
		this.gender = "Male";
		this.address.city = "Mumbai";
		this.address.pinCode = "540003";
		this.address.state = "Maharashtra";
		this.instructorId = 456;
		this.salary = 30000;
	}
	@Override
	public String toString() {
		return "Instructor [studentId=" + instructorId + ", Salary=" + salary + ", address=" + address + "]";
	}
}
class Student extends Person{
	int studentId;
	int courseFee;
	String courseEnrolled;
	Address address;
	public Student(){
		this.name = "Bhargavi";
		this.gender = "Female";
		this.address.city = "Hyderbad";
		this.address.pinCode = "520103";
		this.address.state = "Telangana";
		this.studentId = 11;
		this.courseFee = 10000;
		this.courseEnrolled = "JA111";
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", courseFee=" + courseFee + ", courseEnrolled=" + courseEnrolled
				+ ", address=" + address + "]";
	}
}
