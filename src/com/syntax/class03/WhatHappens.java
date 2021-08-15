package com.syntax.class03;

public class WhatHappens {
	public static void main(String[] args) {
	
	
	
	 //Casting in Java: 
	  
	 /* widening / implicit / automatic
	 * byte -> short -> int -> long -> float -> double
	 */
	 double d=100; //100.0 widening casting bigger box does it automatically
	  
	  
	 /* narrowing / explicit / manual
	 * double -> float -> long -> int -> short -> byte
	 */ 
	 int i=(int)1.99; //1 --lose everything that wont fit in the int box or all decimals
	  
	  byte b=(byte)140; // -116 java doesnt like when you try to force a box to hold a value too big 
	  // goes up to 127 then back to -128 + whatever else you tried to put in the box so -128+13=-116
	 System.out.println(b);
		
	 //when dividing use double because you will not get the decimal values with int
	 
	 
	 /*
	  * Operators in JAVA:
	  * = assignment operator
	  * +, -, *, /, % --> arithmetic operator
	  * 
	  * relational operators:
	  * >, >=, <, <=, 
	  */
	 	
	}
}
