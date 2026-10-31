package com.languagefundamentals.methods;

import java.util.Scanner;

//ii) No-return_type & With Parameters: BODMAS 
public class TestMethodsDemo3 {

	static void addition(int a, int b) {// a and b are parameters
		System.out.println("Addition method called ");
//		System.out.println("sum of two number is : " + a + b);
		System.out.println("sum of two number is : " + (a + b));// String plus anything is String --> 2050
	}

	static void subtraction(float a, int x) {
		System.out.println("subtraction method called  ");
		////		The operator - is undefined for the argument type(s) String, float
//		System.out.println("Difference between two numbers is : " + x-a);
		System.out.println("Difference between two numbers is : " + (x - a));
	}

	static void multiplication(float a, float b, float c) {
		System.out.println("Multplication method called ");
		System.out.println("Product of two numbers : " + (a * b * c));
	}

	static void division(float a, float b) {
		System.out.println("Division method called ");
		System.out.println("Quotient of Three numbers : " + a / b);
	}

	static void modulus(double d1, double d2) {
		System.out.println("Modulus method called ");
		System.out.println("Reminder of two numbers : " + d1 % d2);
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number ");
		int a = sc.nextInt();
		System.out.println("Enter b number ");
		int b = sc.nextInt();
		addition(a, b);// 20 and 50 are the arguments --> Call by the value

		System.out.println("Enter a number for subtrcation ");
		float f1 = sc.nextFloat();
		System.out.println("Enter another for subtrcation ");
		int f2 = sc.nextInt();

		subtraction(f1, f2);
		
		multiplication(2, 3, 6);// int can convert float
		division(100, 9);
		modulus(99, 6);

		System.out.println("main method ended ");
	}
}
