package com.syntax.class05;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter your quiz, mid term and final score");
		Scanner scan = new Scanner(System.in);

		int quiz, mid, finals, total;
		String Grade;
		quiz = scan.nextInt();
		mid = scan.nextInt();
		finals = scan.nextInt();
		total = (quiz + mid + finals) / 3;
		if (total >= 90) {
			Grade = "A";
		} else if (total >= 70 && total < 90) {
			Grade = "B";
		} else if (total >= 50 && total < 70) {
			Grade = "C";
		} else {
			Grade = "F";
		}

		System.out.println("Your grade is " + Grade);

		//Homework number 2
		
		
		scan = new Scanner(System.in);

		System.out.println("Please enter your birth month");
		String month = scan.nextLine();
		String season="Unknown";
		if (month.equals("June") || month.equals("July") || month.equals("August")) {
			season = ("Summer");
		} else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			season =( "Fall");
		} else if (month.equals("December") || month.equals("January") || month.equals("Febuary")) {
			season = ("Winter");
		} else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			season =("Spring");
		} else {
			System.out.println("Please check spelling and / or capitalize the month name");
		}
		System.out.println("You were born in the "+season+" season");

		//homework number 3
		
		
	}

}
