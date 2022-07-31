package ques1;

public class Main {
	
	public static void main(String[] args) {
		Employee obj = new Employee();
		Manager obj2 = new Manager();
	
	}
}
class Member {
	String name; 
	int age; 
	String phNum; 
	String address;
	double salary;
	
	void PrintSalary(double sal) {
		
	}
}
class Employee extends Member{
	String specification;
	String department;
	
	
	
	Employee(){
		this.name = "Eswar";
		this.age = 26;
		this.phNum = "1234567899";
		this.address = "Jaggaiahpet";
		this.salary = 70000.00;
		this.specification = "Back end developer";
		this.department = "Services";
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
		System.out.println("Phone Number : "+this.phNum);
		System.out.println("Address : "+this.address);
		System.out.println("Salary : "+this.salary);
		System.out.println("Specification : "+this.specification);
		System.out.println("Department : "+this.department+"\n");
	}
}
class Manager extends Member{
	String specification;
	String department;
	Manager(){
		this.name = "Krishna";
		this.age = 32;
		this.phNum = "1234567899";
		this.address = "Vijayawada";
		this.salary = 120000.00;
		this.specification = "Manager";
		this.department = "Admin";
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
		System.out.println("Phone Number : "+this.phNum);
		System.out.println("Address : "+this.address);
		System.out.println("Salary : "+this.salary);
		System.out.println("Specification : "+this.specification);
		System.out.println("Department : "+this.department);
	}
}
