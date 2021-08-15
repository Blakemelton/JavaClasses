package com.syntax.class03;

public class IfElseStatementDemo {
	public static void main(String[] args) {

		/*
		 * I have money and I know the price If i have more money --> I will buy cookies
		 * otherwise i will cry
		 */

		double money = 10;
		double $cookie = 15.99;

		if (money > $cookie) {
			System.out.println("I am buying those cookies");
		} else {
			System.out.println("I am going to cry");
		}

		// What is the largest number

		int num01 = 20;
		int num02 = 10;

		if (num01 > num02) {
			System.out.println(num01 + " is larger than " + num02);
		} else if (num01 < num02) {
			System.out.println(num01 + " is smaller than " + num02);
		} else {
			System.out.println(num01 + " is equal to " + num02);
		}

		int day = 62;

		if (day == 1) {
			System.out.println("its Monday");
		} else if (day == 2) {
			System.out.println("Its Tuesday");
		} else if (day == 3) {
			System.out.println("Its Wednesday");
		} else if (day == 4) {
			System.out.println("Its Thursday");
		} else if (day == 5) {
			System.out.println("Its Friday");

		} else if (day == 6) {
			System.out.println("Its Saturday");
		} else if (day == 7) {
			System.out.println("Its Sunday");
		} else {
			System.out.println("Unknown Day");
		}

	}
}
