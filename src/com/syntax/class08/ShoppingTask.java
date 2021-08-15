package com.syntax.class08;

import java.util.Scanner;

public class ShoppingTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		String item;
		System.out.println("Please enter the item you would like to buy");
		item = scan.nextLine();
		double price, payment, total = 0, change = 0, left = 0;
		System.out.println("Please enter the price of the item");
		price = scan.nextDouble();
		System.out.println("Please enter your payment amount");
		do {
			payment = scan.nextDouble();
			if (payment < price) {
				total = payment + total;
				left = price - total;
				if (total != price) {
					System.out.println("You still owe " + left + " please enter more money");
				}else if(total==price) {
					break;
				} 
			}else if (payment > price) {
					change = payment - price;
					System.out.println("Your change is " + change);
					break;
				}
		} while (payment != price);

		System.out.println("Thank you for shopping");

	}
}
