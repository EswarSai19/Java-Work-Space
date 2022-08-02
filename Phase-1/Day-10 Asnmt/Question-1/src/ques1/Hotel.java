package ques1;

public interface Hotel {
	void chickenBiryani();
	void masalaDosa();
}
class TajHotel implements Hotel{

	@Override
	public void chickenBiryani() {
		System.out.println("Taj hotel Chicken Biriyani ready...");
		
	}

	@Override
	public void masalaDosa() {
		System.out.println("Taj hotel masala dosa ready...");
		
	}
	
	public void welcomeDrink(){
		System.out.println("Welcome Drink from the TajHotel");
	}
	
}
class RoadSideHotel implements Hotel{

	@Override
	public void chickenBiryani() {
		System.out.println("Road side hotel Chicken Biriyani ready...");	
	}

	@Override
	public void masalaDosa() {
		
		System.out.println("Road side hotel masala dosa ready...");
	}
	
}
