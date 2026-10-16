package com.javaintroduction;

public class Test2 {
	static int a;

	// static block
	static {
		System.out.println("Good Morning ");
	}

	// main method
	public static void main(String[] args) {
		System.out.println("main method started ");
		System.out.println(a);
		System.out.println("main method ended ");
	}

	// static block
	static {
		System.out.println("Good day");
	}
}
