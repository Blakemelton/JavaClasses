package com.syntax.reviewclass03;

public class ShortHandOperators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=10;
		System.out.println(++x); // x=11 ---- increments it first then prints
		System.out.println(x++); // x=11 --prints value and then increments and stores value
		System.out.println(x); // x=12 --incremented from the x++ before
		System.out.println(++x+(++x));
	}

	
}
