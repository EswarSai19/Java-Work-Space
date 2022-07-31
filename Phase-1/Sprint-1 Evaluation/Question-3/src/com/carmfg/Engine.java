package com.carmfg;

public class Engine {
	private int rpm;
	private int power;
	private String manufacturer;
	private boolean hasTurbo;
	
	public Engine() {
		this.rpm = 1000;
		this.power = 20;
		this.manufacturer = "Tata";
		this.hasTurbo = false;
	}
	
	
	public void setRpm(int rp) {
		this.rpm = rp;
	}
	public int getRpm() {
		return rpm;
	}
	public void setPower(int po) {
		this.power = po;
	}
	public int getPower() {
		return power;
	}
	public void setManufacturer(String mfr) {
		this.manufacturer = mfr;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setTurbo(boolean trb) {
		this.hasTurbo = trb;
	}
	public boolean getTurbo() {
		return hasTurbo;
	}
	
	public boolean handleTurbo(boolean tr) {
		setTurbo(!tr);
		return hasTurbo;
	}
}
