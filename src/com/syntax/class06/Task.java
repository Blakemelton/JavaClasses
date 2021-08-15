package com.syntax.class06;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);

		System.out.println("Is there a sale yes / no?");
		String sale=scan.nextLine();
		boolean yes=true;
		double price;
		String item;
		double disc;
		double total;
		String discount;
		
		if(yes) {
			System.out.println("What is the item?");
			item=scan.nextLine();
			System.out.println("What is the price?");
			price=scan.nextDouble();
			if(price<20.0) {
				disc=.9;
				discount = " of 10% ";
			}else if(price>20.0 && price<100.0) {
				disc=.8;
				discount = " of 20% ";
			}else if(price>100.0 && price<500.0) {
				disc=.70;
				discount = " of 30% ";
			
			}else {
				disc=.5;
				discount = " of 50% ";
			}
			total=price*disc;
			System.out.println("After discount" +discount+"the price of "+item+" was reduced from $"+price+" to $"+total);
	}else {System.out.println("You are not going shopping");
	}
}
}
