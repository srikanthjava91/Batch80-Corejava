package com.languagefundamentals.methods;

import java.util.Scanner;

//WAP to print Student info 
public class TestMethodsDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age : ");
		int age = sc.nextInt();

		System.out.println("Enter your First name ");
		sc.nextLine();
		String fn = sc.nextLine();
		System.out.println("Enter your last name : ");
		String ln = sc.next();

		System.out.println("Enter your Height :");
		float h = sc.nextFloat();

		System.out.println("ENter your Weight :  ");
		double weight = sc.nextDouble();

		System.out.println("ENter your Gender info : ");
		char c = sc.next().charAt(0);// Method Chaining

		// Calling the method by value
		getStudentAge(age);
		getStudentFullName(fn, ln);
		getStudentHeight(h);
		studentWeightinfo(weight);
		getstudentGender(c);

		System.out.println("main method ended ");
	}

	static void getStudentAge(int age) {
		System.out.println("Student age is :  " + age);
	}

	static void getStudentFullName(String fname, String lname) {
		System.out.println("Student full name is : " + fname + " " + lname);
	}

	static void getStudentHeight(float height) {
		System.out.println("Student Height is : " + height);
	}

	static void studentWeightinfo(double weight) {
		System.out.println("Student Weight info : " + weight);
	}

	static void getstudentGender(char gen) {
		System.out.println("Student Gender is : " + gen);
	}

}
