package com.syntax.class05;

public class LogicalAndOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Logical And
		// (&&) both variables have to be true to execute if any is false will skip
		/*
		 * true && true -> true
		 * true && false -> false
		 * false && true -> false
		 * false && false -> false
		 */
		
		
		
		int num=54;
		if (num>1 && num<10) {
			System.out.println("Number is small");
		}else if(num>10 && num<100) {
			System.out.println("number is medium");
		}else if(num>100 && num<1000) {
			System.out.println("number is large");
		}

		//Logical OR
		// (||) if any of the statements or variables are true, it will be true. 
		/*
		 * true || true -> true
		 * true || false -> true
		 * false || true -> true
		 * false || false -> false
		 */
	
	String day="Saturday";
	
	if (day.equals("monday")||day.equals("friday")) {
		System.out.println("No class");
	}else if(day.equals("Tuesday")||day.equals("Wednesday")) {
		System.out.println("Manual Class");
	}else if(day.equals("Thursday")) {
		System.out.println("Review Class");
	}else if(day.equals("Saturday")||day.equals("Sunday")) {
		System.out.println("Java Class");
	}else {
		System.out.println("invalid day");
	}
	
	
	//Logical Not
	/*
	 * (!) Changes a true or false to the opposite
	 * true=false
	 * false=true
	 */
	
	boolean hungry=true;
	
	if(!hungry) {
		System.out.println("I am not hungry");
	}else {
		System.out.println("I am hungry");
	}
	
	
	
	
	}

}
