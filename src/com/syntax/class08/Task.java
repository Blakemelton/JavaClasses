package com.syntax.class08;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=50; i++) {
			if(i%3==0)
				continue;
		
		System.out.print(i+" ");
		}
		
		System.out.println("next task");
		String answer;
		Scanner scan=new Scanner(System.in);
		
		do {
			System.out.println("Did you apply for a credit card yes or no");
			answer=scan.next();
			if(answer.equalsIgnoreCase("yes")) {
				break;
			}
		}while (!answer.equals("yes"));
	}
		
	}


