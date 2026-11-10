package com.languagefundamentals.constructor;

//Q) Already Java Compiler providing the Default constructor 
//Then Why no-arg constructor ..?
//Ans1  : Instead of JVM providing the default values, 
//Developer can initialize the default values while creating the Object will use no-arg constructor.  
//Ans2 : If Java program contains any other constructors then Java compiler will not create a default constructor.
//In that scenario, If we want to create just like a normal java object without passing any arguments then we need no-arg constructor.
public class Student {

	int roll_number;
	String name;
	int age;

//	Constructor
	Student() {
		System.out.println("no-arg constructor called ");
		roll_number = 100;
		name = "unknown";
		age = 21;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

//		The below object is created with the help of default constructor created by compiler.
//		The below object is created with the help of no-arg constructor.
		Student s = new Student();
		System.out.println(s.roll_number);
		System.out.println(s.name);
		System.out.println(s.age);

		System.out.println("main method ended ");

	}

}
