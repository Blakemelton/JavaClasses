package com.syntax.class06;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two different numbers:");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int result =0;
		System.out.println("Please enter your operator");
		String operator = scan.next();
		switch (operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		
		}
		System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
	}

	
}
