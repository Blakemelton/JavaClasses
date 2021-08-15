package com.syntax.class02;

public class PracticeMath {

	public static void main(String[] args) {

		double n1,n2;
		n1=1.99;
		n2=4.34;
		double sum=n1+n2;
		double sub=n1-n2;
		double mult=n1*n2;
		double divi=n1/n2;
		
		System.out.println("the sum of my 1.99 and 4.34 is "+sum);
		System.out.println("the remainder of 1.99 nad 4.34 is "+sub);
		System.out.println("the multiplication of 1.99 nad 4.34 is "+mult);
		System.out.println("the divison of 1.99 nad 4.34 is "+divi);
		
		double num3=3.9;
		double square=num3*num3;
		
		System.out.println("the square of " +num3+" and "+num3+" is "+square);
		
		int num4,num5;
		num4=5;
		num5=8;
		int perim=2*num4+2*num5;
		int area=num4*num5;
		
		System.out.println("The perimeter of a rectangle with a width of "+num4+" and height of "+num5+" is equal to "+perim+" and the area is "+area);
		
		
	}

}
