package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=0; i<=3; i++) {
			if(i==1) {
				continue; //skips the rest of the code when if condition is met
			}
			System.out.println("I am inside the loop");
			System.out.println(i);
		}
		
		// I want to print all numbers from 1 till 10 except number 5 and 9
		
		for( int i=1; i <=10; i++){
			if (i==5 || i==9) {
				continue;
			}
			System.out.print(i+" ");
		}
	}

}
