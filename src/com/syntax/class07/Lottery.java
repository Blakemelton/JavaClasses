package com.syntax.class07;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int secretnum, usernum;
		secretnum=15;
		
		do {
		System.out.println("Please guess my secret number(1-20)");
		usernum=scan.nextInt();
		}while(usernum!=secretnum);
		
		System.out.println("Congrats you win");
		
	}

}
