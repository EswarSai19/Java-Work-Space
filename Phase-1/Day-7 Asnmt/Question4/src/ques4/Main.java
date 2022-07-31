package ques4;

public class Main {
	public static void main(String[] args) {
		AxisBank axObj = new AxisBank();
		ICICIBank IcObj = new ICICIBank();
		axObj.displayDetails();
		IcObj.displayDetails();
		axObj.getCreditCard();
	}
	
	
}
class Bank{
	String branchName; 
	String IfscCode; 
	void displayDetails() {
		System.out.println("I am in Bank");
	}
}
class AxisBank extends Bank{
	double rateOfInterest;
	AxisBank(){
		this.branchName = "Axis Bank";
		this.IfscCode = "AXI0002345";
		this.rateOfInterest = 2.50;
	}
	
	void getCreditCard(){
		System.out.println("Get the Credit Card from the Axis bank");
	}
	@Override
	void displayDetails() {
		System.out.println("I am in Axis Bank");
		System.out.println("Branch Name : "+this.branchName);
		System.out.println("IFSC Code : "+this.IfscCode);
		System.out.println("Rate of Interest: "+this.rateOfInterest+"\n");
	}
}
class ICICIBank extends Bank{
	double rateOfInterest; 
	ICICIBank(){
		this.branchName = "ICICI Bank";
		this.IfscCode = "ICI0002365";
		this.rateOfInterest = 3.50;
	}
	@Override
	void displayDetails() {
		System.out.println("I am in ICICI Bank");
		System.out.println("Branch Name : "+this.branchName);
		System.out.println("IFSC Code : "+this.IfscCode);
		System.out.println("Rate of Interest: "+this.rateOfInterest+"\n");
	}
}
