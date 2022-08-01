package ques3;


public class Car {
	private int numberOfPassenger; 
	private int numberOfKms;
	
	public int getNumberOfPassenger() {
		return numberOfPassenger;
	}
	public void setNumberOfPassenger(int numberOfPassenger) {
		this.numberOfPassenger = numberOfPassenger;
	}
	public int getNumberOfKms() {
		return numberOfKms;
	}
	public void setNumberOfKms(int numberOfKms) {
		this.numberOfKms = numberOfKms;
	}
}
class Sedan extends Car{
	final int farePerKm =20;
	public Sedan(int num){
		this.setNumberOfKms(farePerKm);
		this.setNumberOfPassenger(num);
	}
	
}
class HatchBack extends Car{
	final int farePerKm =15;
	public HatchBack(int num2){
		this.setNumberOfKms(farePerKm);
		this.setNumberOfPassenger(num2);
	}
	
}
class OLA{
	
	
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		if(numberOfPassenger<=3) {
			return new HatchBack(numberOfPassenger);
		}else {
			return new Sedan(numberOfPassenger);
		}
	}

	public int calculateBill(Car car) {
		
		if(car instanceof HatchBack) {
			int x = car.getNumberOfKms()* 15;
			System.out.println(car);
			return x;
		}else {
			System.out.println(car);
			int x = car.getNumberOfKms()* 20;
			return x;
		}
			
		
		
	}
}
