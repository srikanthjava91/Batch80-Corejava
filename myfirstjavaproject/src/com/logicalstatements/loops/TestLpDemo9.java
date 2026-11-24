package com.logicalstatements.loops;
//WAp to print Factorial of a Given number using Recursion ..? 

import java.util.Scanner;

//Recursion : Calling the method inside the same method will consider as Recursion.

public class TestLpDemo9 {

	static int fact(int n) {

		if (n == 0 || n == 1) {
			return 1;
		}

		return n * fact(n - 1);

	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		// Reading the elements from console we use Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		// pass the n value to the method
		int f = fact(n);

		System.out.println("Factorial of a Given number is : " + f);
		System.out.println("main method ended ");
	}

}
