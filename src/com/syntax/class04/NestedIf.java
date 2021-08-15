package com.syntax.class04;

public class NestedIf {
	public static void main(String[] args) {

		boolean vaccine = true;
		boolean secondDose = true;

		if (vaccine) {
			System.out.println("did you get the second dose?");

			if (secondDose) {
				System.out.println("you are fully vaccinated");
			} else {
				System.out.println("you will need the second dose");
			}
		}

		System.out.println("------ ANOTHER EXAMPLE OF NESTED IF -------");

		/*
		 * every friday is movie night if it is the 13th --> you want to watch a scary
		 * movie
		 * 
		 */

		int day = 13;
		boolean isFriday = true;

		if (isFriday) {
			System.out.println("I am going to watch a movie");
			if (day == 13) {
				System.out.println("YAY, I am watching a scary movie");
			} else {
				System.out.println("I am watching whatever is popular");
			}
		} else {
			System.out.println("I am going to study");
		}

		/*
		 * Taken the test -> yes or no
		 * 
		 * If you taken the test what is the score
		 * 
		 * score is more than 90 -> 'A Student score more than 80 -> B Student score is
		 * more that 70 -> C student otherwise : you need to study more for the test
		 * 
		 */

		boolean takenTest = true;
		int score = 80;

		if (takenTest) {
			System.out.println("what was your score?");
			
			if (score > 90) {
				System.out.println("You are an A student");
			} else if (score > 80) {
				System.out.println("you are a B student");
			} else if (score > 70) {
				System.out.println("you are a C student");
			} else {
				System.out.println("you need to study more");
			}
		} else {
			System.out.println("you need to take the test");
		}

	}
}
