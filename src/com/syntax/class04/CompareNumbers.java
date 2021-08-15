package com.syntax.class04;

import java.util.Scanner;

public class CompareNumbers {

	public static void main(String[] args) {

		// compare 2 numbers and see which on is the largest

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a random number");
		double num1 = input.nextDouble();

		System.out.println("Please enter another random number");
		double num2 = input.nextDouble();

		if (num1 > num2) {
			System.out.println(num1 + " is larger than " + num2);
		} else if (num1 < num2) {
			System.out.println(num1 + " is smaller than " + num2);
		} else {
			System.out.println(num1 + " is the same as " + num2);
		}

	}

}
