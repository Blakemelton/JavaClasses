package com.syntax.class05;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int height=65;
		
		if(height<=60) {
			System.out.println("Short");
		}else if(height>=60&&height<=72) {
				System.out.println("meduim");
			}else {
				System.out.println("tall");
		}

	int day =6;
	
	if((day==1)||(day==2)||(day==3)||(day==4)||(day==5)) {
		System.out.println("Weekday");
	}else if((day==6)||(day==7)) {
		System.out.println("weekend");
	}else {
		System.out.println("invalid day number should be 1-7");
	}
	
	
	Scanner scan= new Scanner(System.in);
	int num1, num2, num3, largest;
	
	System.out.println("Please enter 3 different numbers");
	 num1=scan.nextInt();
	 num2=scan.nextInt();
	 num3=scan.nextInt();
	
	if(num1>=num2 && num1>=num3) {
		System.out.println(num1+" is the largest number");
	}else if(num2>=num1 && num2>=num3) {
		System.out.println(num2+" is the largest number");
	}else {
		System.out.println(num3+" is the largest number");
	}
	
	//better way
	
	System.out.println("Please enter 3 different numbers");
	 num1=scan.nextInt();
	 num2=scan.nextInt();
	 num3=scan.nextInt();
	 
	 if(num1>=num2 && num1>=num3) {
		 largest=num1;
	 }else if(num2>=num1 && num2>=num3) {
		 largest =num2;
	 }else {
		 largest =num3;
	 }
	 System.out.println(largest+" is the largest");
	 }
	 
	
	
	
	
	
	
	
	
	
	
	
	
}
