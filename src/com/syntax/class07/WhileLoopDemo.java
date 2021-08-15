package com.syntax.class07;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//I want to print How are you? 10 times
		
		int a =1;
		while (a<=20) {
			System.out.println(a);a++;
		}
		
		// I want to print numbers from 100-110
		
		int var =100;
		while(var<=110)
		{
			System.out.println(var+" ");
			var++;
		}
	
	// I want to print numbers from 10-1
		
		int num=10;
		while (num>=1) {
			System.out.println(num);
			num--;
		}
	
	// I want to print odd numbers from 1-20
		
		int n=1;
		while(n<=20) {
			System.out.println(n);
		n+=2;
		}
	
		
		// do while loop --does the do before it checks the condition to loop
		
		int j=1;
		do {
			System.out.println("hello");
			j++;
		}while(j<=3);
		
		
		int b=1;
		do {
			System.out.println(b);
			b++;
		}while (n<=10);
		
		
	}
		
		
		
		
		
	
	
	

}
