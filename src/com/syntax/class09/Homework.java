package com.syntax.class09;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		
		//Find the sum of all numbers in array
		
		int sum=0;
		int[] num= {33, 54,22,787,9,2};
		for(int i:num) {
			sum+=i;
		}
			System.out.println(sum);
		
		
		// find the largest number in array
		
		int[] fig= {33, 54,22,787,9,2};
		int large =fig[0];
		for(int a=1; a<fig.length; a++) {
			if(fig[a]>large) {
				large=fig[a];
			}
			
		}
		System.out.println(large);
	}

}
