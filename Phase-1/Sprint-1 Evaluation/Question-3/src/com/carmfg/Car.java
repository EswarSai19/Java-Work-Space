package com.carmfg;

public class Car {
	private String model;
	private String companyName;
	private String color;
	Engine engine;
	
	public Car() {
		this.model = "Harrier";
		this.companyName = "Tata";
		this.color = "black";
		
	}
	Engine e1 = new Engine();
	
	public void setModel(String mdl) {
		this.model = mdl;
	}
	public String getModel() {
		return model;
	}
	public void setName(String name) {
		this.companyName = name;
	}
	public String getName() {
		return companyName;
	}
	public void setColor(String clr) {
		this.color = clr;
	}
	public String getColor() {
		return color;
	}
}
