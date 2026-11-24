package com.logicalstatements.loops;

import java.util.Scanner;

//WAp to print Factorial of a Given number using for loop ..? 
//input : 5 
//output : 5 * 4 * 3 * 2 *1 = 120 
public class TestLPDemo8 {

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

	static int fact(int n) {
		int fact = 1;

		for (int i = n; i >= 1; i--) {
			fact = fact * i;// 5*4=20*3 =60 *2 =120*1 = 120
		}
		return fact;
	}

}
