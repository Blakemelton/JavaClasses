package com.syntax.class07;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//I want to say hi 4 times
		
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");
		
		int a=1;
		
		
		System.out.println(" ---Hello using IF statement---");
		
		if(a<4) {
			System.out.println("Hello");
		}
		
		
		System.out.println("----Hello using WHILE loop ----");
		
		while (a<=4) {
			System.out.println("Hello");
			a++;
		}
		
		/*
		 * Example of infinite loop
		 * 
		 * 	while (a<=4) {
			System.out.println("Hello");
			}
		 * 
		 */
		
		
	}

}
