package com.syntax.class02;

public class ShorthandOperators {

	public static void main(String[] args) {

		int num = 20;
		num = num + 100;

		num = num - 60;
		System.out.println(num);

		int number = 100;
		number += 100;
		System.out.println(number);//200
		number -= 30;

		System.out.println(number);//170
		
		number/=10;
		System.out.println(number);//17
	}

}
