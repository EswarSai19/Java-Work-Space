package ques2;

public class Main {
	public static void main(String[] args) {
		DayScholar dsObj = new DayScholar();
		double tot = dsObj.payFee(2000.00);
		dsObj.displayDetails("Vishal",101,10000.00,0.00,2000.00,tot);
		Hosteller hsObj = new Hosteller();
		double tot2 = hsObj.payFee(3000.00);
		dsObj.displayDetails("Arjun",102,10000.00,3000.00,0.00,tot2);
	}
}
class Student{
	int studId;
	String studName;
	double examFee;
	
	void displayDetails(String name,int id, double exmFee,double hstlFee, double trnsFee, double total) {
		System.out.println("Name : "+name);
		System.out.println("Id : "+id);
		System.out.println("Exam Fee : "+exmFee);
		if(hstlFee==0.00) {
			System.out.println("Transport Fee : "+trnsFee);
		}
		else {
			System.out.println("Hostel Fee : "+hstlFee);
		}
		
		
		System.out.println("Total Fee : "+total);
		
		
	}
	double payFee(double i) {
		return (this.examFee+i);
	}
}
class DayScholar extends Student{
	
	double transportFee;
	DayScholar(){
		super.examFee = 10000.00;
	}
	
}
class Hosteller extends Student{
	double hostelFee; 
	Hosteller(){
		super.examFee = 10000.00;
	}
}
