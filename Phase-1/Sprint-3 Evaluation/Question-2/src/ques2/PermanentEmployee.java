package ques2;

public class PermanentEmployee extends Employee {
	
	private double basicPay;
	

	@Override
	void calculateSalary() {
		double pfAmt = this.basicPay*0.12;
		double sal = this.basicPay-pfAmt;
		this.setSalary(sal);
		
		
	}
	
	public PermanentEmployee(int employeeId, String employeeName,double basicPay) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
	}
	
}
