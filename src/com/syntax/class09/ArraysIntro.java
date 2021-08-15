package com.syntax.class09;

public class ArraysIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num=10;
		
		int[] arr = new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		System.out.println(arr[2]+arr[0]); //40
		
		// I want to store week days
		
		String[] days= new String[7];
		days[0] = "Monday";
		days[1] ="Tuesday";
		days[2]="Wednesday";
		days[3]= "Thursday";
		days[4]="Friday";
		days[5]="Saturday";
		days[6]="Sunday";
		
		String[] names= {"Jose", "Sule", "Blake","Enes","Ana","Andrei","Burju"};
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
			
		}
		System.out.println("-----CAR TASK------");
		
		String[] cars= {"Chevy", "Ford","Honda", "Toyota","Acura","Audi"};
		for(int a=0; a<cars.length; a++) {
			System.out.println(cars[a]);
		}
	}

}
