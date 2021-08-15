package com.syntax.class03;

public class RelationalOperators {
	public static void main(String[] args) {
		
		/*
		  * Operators in JAVA:
		  * = assignment operator
		  * +, -, *, /, % --> arithmetic operator
		  * 
		  * relational operators:
		  * >, >=, <, <=, ==,!=
		  */
		
		int num =10;
		int num1=20;
		
		System.out.println(num>num1); //false
		System.out.println(num!=num1); //true
		System.out.println(num<num1); //true
		System.out.println(num==num1); //false
		System.out.println(num>=num1); //false
		
		int a=100;
		int b=190;
		
		boolean boo=a<b; //result of the relational operators ALWAYS a boolean value (true or false)
		System.out.println(boo); //true
		
		System.out.println(a==b); //false--- result will be true of false
		System.out.println(a=b); // 190--- reassigning the value of 'b' to 'a'
		
		
	
	
 }
}
