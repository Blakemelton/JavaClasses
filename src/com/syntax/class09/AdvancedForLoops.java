package com.syntax.class09;

public class AdvancedForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] cars= {"Chevy", "Ford","Honda", "Toyota","Acura","Audi"};
		for(int a=0; a<cars.length; a++) {
			System.out.println(cars[a]);
		}
		
		for(String car:cars) {
			System.out.println(car);
		}
		
		
		int[] numbers= {100,20,67,45,90,23};
		for (int num:numbers) {
			System.out.println(num);
		}
		
		
	}

	

}
