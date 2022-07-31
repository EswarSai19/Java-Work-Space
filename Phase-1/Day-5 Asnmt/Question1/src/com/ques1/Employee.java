package com.ques1;

public class Employee {
	private int empId;
	private String empName;
	private double salary;
	private double netSalary;
	
	
	
	public Employee(int id, double sal, String name) {
		this.empId = id;
		this.empName = name;
		this.salary = sal;
	}
	

	public void setId(int id) {
		this.empId = id;
	}
	public int getId() {
		return empId;
	}
	public void setName(String name) {
		this.empName = name;
	}
	public String getName() {
		return empName;
	}
	public void setSalary(double sal) {
		this.salary = sal;
	}
	public double getSalary() {
		return salary;
	}
		
	 public void calculateNetSalary(int pfpercentage) {
		 
		 double x = ((salary*pfpercentage)/100);
		 this.netSalary = salary-x;
		 
	 }
	 public double getNetSalary() {
			return netSalary;
		}
}
