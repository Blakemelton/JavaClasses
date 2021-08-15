package com.syntax.class04;

public class Task {
	public static void main(String[] args) {

		boolean diploma = true;
		double gpa = 2.9;

		if (diploma) {
			System.out.println("Congrats, What is your gpa?");
			if (gpa >= 3.5) {
				System.out.println("you are eligible for a scholarship");
			} else {
				System.out.println("you should have studied harder");
			}
		} else {
			System.out.println("you should get a degree");
		}

		System.out.println("-----SECOND TASK------");

		double morgRates = 4.33;
		double morgPrice = 100500;

		if (morgRates < 4.5) {
			System.out.println("What is Price of the house?");
			if (morgPrice > 200000) {
				System.out.println("I will need a load");
			} else {
				System.out.println("I will pay cash");
			}
		} else {
			System.out.println("I will not buy a house today");
		}

		System.out.println("---THIRD TASK----");

		int age = 30;
		double weight = 200;

		if (age >= 18) {
			System.out.println("What is your weight?");
			if (weight > 110) {
				System.out.println("You are eligible to give blood");
			} else {
				System.out.println("you are not eligible");
			}
		} else {
			System.out.println("you are not eligible");
		}

	}
}
