package ques4;

public class Person {
	
	String name;
	String gender;
}
class Address{
	String city;
	String state;
	String pinCode;
	 public Address(String city,String state,String pinCode) {
		this.city = city;
		this.pinCode = pinCode;
		this.state = state;
	 }
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pinCode=" + pinCode + "]";
	}
	
}
class Instructor extends Person{
	int instructorId;
	int salary;
	Address address;
	Address a1 = new Address("Mumbai", "Maharastra","520014");
	public Instructor(){
		this.name = "Vijayendra";
		this.gender = "Male";
		this.instructorId = 456;
		this.salary = 30000;
		
		
	}
	@Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + ", salary=" + salary + ", address=" + a1 + "]";
	}
	
}
class Student extends Person{
	int studentId;
	int courseFee;
	String courseEnrolled;
	Address address;
	Address a2 = new Address("Hyderbad", "Telangana","520103");
	public Student(){
		this.name = "Bhargavi";
		this.gender = "Female";
		this.studentId = 11;
		this.courseFee = 10000;
		this.courseEnrolled = "JA111";
		
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", courseFee=" + courseFee + ", courseEnrolled=" + courseEnrolled
				+ ", address=" + a2 + "]";
	}
}
