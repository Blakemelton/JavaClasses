package com.syntax.class12;

public class Dog {

	String name;
	String breed;
	String color;
	int age;
	double height;
	char gender;

	void bark() {
		System.out.println("Dog can bark");
	}

	void sleep() {
		System.out.println("Dog can sleep");
	}

	public static void main(String[] args) {

		Dog dog1 = new Dog();
		dog1.name = "James";
		dog1.breed = "Bulldog";
		dog1.color = "white";
		dog1.age = 20;
		dog1.height = 15;
		dog1.gender = 'M';
		
		dog1.bark();
		
		Dog dog2= new Dog();
		dog2.name="Winnie";
		dog2.breed="pug";
		dog2.color="tan";
		dog2.age=4;
		dog2.height=5.3;
		dog2.gender='M';
		
		dog2.sleep();
		
			
	}
}
