package com.syntax.class08;

import java.util.Scanner;

public class AnotherTask {
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	
	int num1, num2, even, odd;
	even=0;
	odd=0;
	
	System.out.println("Please enter a range of integers for start and end point(2 numbers)");
	
	num1=scan.nextInt();
	num2=scan.nextInt();
	
	for (int i=num1; i<=num2; i++) {
		if(i%2==0) {
			even+=i;
	}else {
		odd+=i;
	}
	}
		System.out.println(even);
		System.out.println(odd);
}

}
