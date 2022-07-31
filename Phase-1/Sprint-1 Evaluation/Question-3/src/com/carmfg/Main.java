package com.carmfg;

public class Main {
	
	
	Car c1 = new Car();
	public Main() {
		System.out.println("Car Model : "+c1.getModel());
		System.out.println("Manufaturer Name : "+c1.getName());
		System.out.println("Car Color : "+c1.getColor());
		System.out.println("Engine RPM : "+c1.e1.getRpm());
		System.out.println("Engine Power : "+c1.e1.getPower()+"KW");
		System.out.println("Engine Manufacturer : "+c1.e1.getManufacturer());
		System.out.println("Turbo : "+c1.e1.getTurbo()+"\n");
		System.out.println("============================\n");
	}
	
	public Main(String model, String name, String color, int rpm, int power, String mfg,boolean tr) {
		System.out.println(" Car Model : "+model);
		System.out.println("Manufaturer Name : "+name);
		System.out.println("Car Color : "+color);
		System.out.println("Engine RPM : "+rpm);
		System.out.println("Engine Power : "+power+"KW");
		System.out.println("Engine Manufacturer : "+mfg);
		System.out.println("Turbo : "+tr+"\n");
		
	}
	
	
	public static void main(String[] args) {
		Main m1 = new Main();
		m1.c1.e1.handleTurbo(false);
		m1.c1.e1.setRpm(1200);
		m1.c1.setColor("White");
		m1.c1.setModel("Hyundai");
		m1.c1.setName("Amaze");
		m1.c1.e1.setManufacturer("Hyundai");
		m1.c1.e1.setPower(35);
		Main m2 = new Main(m1.c1.getModel(),m1.c1.getName(),m1.c1.getColor(),m1.c1.e1.getRpm(),
				m1.c1.e1.getPower(),m1.c1.e1.getManufacturer(),m1.c1.e1.getTurbo());
		
	}
}
