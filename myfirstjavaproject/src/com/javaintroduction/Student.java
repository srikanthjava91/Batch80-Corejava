package com.javaintroduction;

//Same method name with same parameters will not be compile.
//From Java 25 onwards, no need to keep public static String[] args.(it's Optional)
public class Student {
	public static void main() {
		System.out.println("Welcome to VCUbe !!");
		System.out.println("Welcome to VCUbe !!");
	}

	void main(String[] args) {
		System.out.println("Welcome to VCUbe1 !!");
		System.out.println("Welcome to VCUbe1 !!");
	}

	/*
	 * public static void main(String[] args) {
	 * System.out.println("Welcome to VCUbe2 !!");
	 * System.out.println("Welcome to VCUbe2 !!"); }
	 */
}
