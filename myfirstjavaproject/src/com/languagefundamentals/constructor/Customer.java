package com.languagefundamentals.constructor;

class Person {
	String name;
	int age;
	String city;

	Person(String name, int age, String city) {
		System.out.println("3-arg constructor called from Person ");
	}

	public static void main(String[] args) {
		System.out.println("main method started from Person !");
	}
}

public class Customer extends Person {

	// Implicit super constructor Person() is undefined. Must explicitly invoke
	// another constructor
	Customer() {
		super("Srikanth", 22, "HYD");
		System.out.println("no-arg constructor called from Customer ");
	}

	public static void main(String[] args) {
		System.out.println("main method started from Customer !");

		Customer c = new Customer();
	}

}
