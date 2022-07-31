package com.ques1;

public class Main {
	

	public static Employee getEmployeeDetails() {
		Employee emp1 = new Employee(19,20000.00,"Eswar");
		return emp1;
		
	}
	
	
	public static void main(String[] args) {
		Employee obj = getEmployeeDetails();
		System.out.println("Emp Id : "+obj.getId());
		System.out.println("Emp Name : " +obj.getName());
		System.out.println("Salary : "+obj.getSalary());
		obj.calculateNetSalary(7);
		System.out.println("Net Salary : "+obj.getNetSalary());
	}

	
}
