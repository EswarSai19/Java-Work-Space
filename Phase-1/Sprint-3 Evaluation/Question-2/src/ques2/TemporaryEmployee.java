package ques2;

public class TemporaryEmployee extends Employee {

	private int hoursWorked;
	private int hourlyWages;
		
	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public int getHourlyWages() {
		return hourlyWages;
	}

	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}

	public TemporaryEmployee(int employeeId, String employeeName) {
		super(employeeId, employeeName);
		// TODO Auto-generated constructor stub
	}

	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		
	}
	
}
