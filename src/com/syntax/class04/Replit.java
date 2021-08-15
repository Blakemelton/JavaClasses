package com.syntax.class04;

//shortcut to import: crtl+shift+O
import java.util.Scanner;

public class Replit {

	public static void main(String[] args) {
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Please enter 3 distinct numbers");
		  int num1=scan.nextInt();
		  int num2=scan.nextInt();
		  int num3=scan.nextInt();

		  int max =0;
		  if (max<num1){
		    max=num1;
		    if(max<num2)
		    max=num2;
		    if(max<num3)
		    max=num3;
		  }System.out.println("The largest number is "+max);
		  
		
		
		
		
	}
}