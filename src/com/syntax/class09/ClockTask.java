package com.syntax.class09;

public class ClockTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int a = 0; a <= 2; a++) {
			for (int c = 0; c < 10; c++) {
				if (a == 2 && c == 4) {
					break;
				}
				for (int d = 0; d < 6; d++) {
					for (int b = 0; b < 10; b++) {
						System.out.println(a + "" + c + ":" + d + "" + b);
					}
				}
			}
		}
	}
	
}
