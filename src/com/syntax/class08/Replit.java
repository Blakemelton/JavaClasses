package com.syntax.class08;

import java.util.Scanner;

public class Replit {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		boolean thirsty;
		boolean sleepy;
		String drink;
		System.out.println("Are you thirsty?");
		thirsty =scan.nextBoolean();
		System.out.println("Are you sleepy?");
		sleepy=scan.nextBoolean();
		
		if(thirsty==true &&sleepy==false) {
			drink="water";
		}else if(thirsty==true && sleepy ==true) {
			drink="coffee";
		}else if(thirsty==false && sleepy ==true) {
			drink="tea";
		}else {
			drink="nothing";
		}
		System.out.println("Looks like you need to drink "+drink);
	}
}