package com.syntax.class07;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int total = 1;

		for (int i = 1; i < 10; i++) {
			total *= i;
		}

		System.out.println(total);
		
		int odd =0;
		int even=0;
		for (int a=1; a<=100; a++) {
			if(a%2==0) {
				even+=a;
			}else {
				odd+=a;
			}
		}
		
			System.out.println("the sum of even numbers between 1-100 is "+even);
				System.out.println("the sum of odd numbers between 1-100 is "+odd);
			
			
			
			//Homework #2
			
			Scanner scan =new Scanner(System.in);
			
			int price, userPrice;
			price =3;
			System.out.println("Please enter the price of the candy in whole numbers");
			do {
				userPrice =scan.nextInt();
					if (userPrice>price) {
						System.out.println("Please pay with less money");
					}else if(userPrice<price) {
						System.out.println("Please pay with more money");
					}
				}while (userPrice!=price);
					System.out.println("Please enjoy your candy");
				}
			
			
			
		

	
	}

