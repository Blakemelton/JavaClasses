package com.syntax.class03;

public class TemperatureCheck {
	public static void main(String[] args) {

		double temp = 98;
		if (temp < 32) {
			System.out.println("water will freeze with temperature " + temp);
		} else {
			System.out.println("Water will NOT freeze with temperature " + temp);
		}

	}
}
