package com.operators;

//Arithmetic operators : + - * / % 
public class TestOpDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		int a = 97;
		int b = 20;

		// BODMAS
		System.out.println("Addition of Two numbers : " + (a + b));
//		The operator - is undefined for the argument type(s) String, int
		System.out.println("Subtraction of Two numbers : " + (a - b));
		System.out.println("Product of two numbers " + a * b);// Multiplication
		System.out.println("Quotient of two numbers : " + a / b);// 4//Division
		System.out.println("Reminder of two numbers : " + a % b);// 17//Modulus

	}
}
