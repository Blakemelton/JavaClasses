package com.syntax.class07;

public class ForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		/*
		 * I want to say Hello 5 times
		 * 
		 * 	for( initialization; condition; increment /decrement) {
			code to be repeated;
			}
		 */
		
		
		for(int i=1; i<=5; i++) {
			System.out.println("Hello");
		}
		
		int sum=0;
		for(int i=0; i<=40; i+=10) {
			sum+=i;
			}
		
		System.out.println(sum);
	}

}
