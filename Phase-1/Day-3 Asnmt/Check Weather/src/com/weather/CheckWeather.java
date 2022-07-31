package com.weather;

public class CheckWeather {
	public static void main(String[] args) {
		boolean isRaining = false;
		boolean isSnow = false;
		double temp = 40.0;
		if(isRaining && isSnow || temp<=50.0) {
			System.out.println("Let's stay home");
		}else {
			System.out.println("Let's go out");
		}
		
	}
}
