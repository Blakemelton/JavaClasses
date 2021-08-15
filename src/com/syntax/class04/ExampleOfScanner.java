package com.syntax.class04;

//shortcut to import: crtl+shift+O
import java.util.Scanner;

public class ExampleOfScanner {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);//creating scanner
		
		System.out.println("Please Enter Your Name");
		
		//captured String values and we stored inside variable value
		String name = scan.nextLine();//capturing String value

		System.out.println("Hello " + name);

		//capture integer value
		System.out.println("Please enter your age");
		int age=scan.nextInt();
		System.out.println(name+" is "+age+" years old");
	
	
	
	
	
	}
}
