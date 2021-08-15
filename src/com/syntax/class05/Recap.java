package com.syntax.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		System.out.println(num);
		char singleChar = scan.next().charAt(0);//takes the first letter in a string or word--(1) takes the second letter
		System.out.println(singleChar);
		String str = scan.next();
		System.out.println(str);

		
	}

}
