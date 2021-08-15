package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// else if statement
		
		int day = 62;

		if (day == 1) {
			System.out.println("its Monday");
		} else if (day == 2) {
			System.out.println("Its Tuesday");
		} else if (day == 3) {
			System.out.println("Its Wednesday");
		} else if (day == 4) {
			System.out.println("Its Thursday");
		} else if (day == 5) {
			System.out.println("Its Friday");

		} else if (day == 6) {
			System.out.println("Its Saturday");
		} else if (day == 7) {
			System.out.println("Its Sunday");
		} else {
			System.out.println("Unknown Day");
		}

		
	// same example using switch statement
		
		String dayName;
		
		switch(day) {
		case 1:
			dayName="Monday";
			break;
		case 2:
			dayName="Tuesday";
			break;
		case 3:
			dayName="Wednesday";
			break;
		case 4:
			dayName="Thursday";
			break;
		case 5:
			dayName="Friday";
		case 6:
			dayName= "Saturday";
			break;
		case 7:
			dayName= "Sunday";
			break;
		default:
				dayName="Invalid day number";
			break;
		
		}
		System.out.println("Today is "+dayName);
		
			
		}
	

}
