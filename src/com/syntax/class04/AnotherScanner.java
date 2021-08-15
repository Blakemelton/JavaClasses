package com.syntax.class04;

import java.util.Scanner;

public class AnotherScanner {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter your FIRST name");
		String name=input.nextLine();
		
		System.out.println("Please enter your LAST name");
		String lastName=input.nextLine();
		
		System.out.println("Please tell me the city that you are from");
		String city=input.nextLine();
		
		System.out.println("Nice to meet you "+name+" "+lastName+" from "+city);
		

	
	}
}
