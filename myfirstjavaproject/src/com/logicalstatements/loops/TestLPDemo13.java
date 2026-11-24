package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to print the count of the digit from a Given number..?  
//input : 2345 --> 123 --> 456789 
//output --> 4 --> 3   --> 6 
public class TestLPDemo13 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		System.out.println("Count is : " + countDigit(n));
	}

	static int countDigit(int n) {
		int count = 0;

		// 123
		while (n > 0) {
			n = n / 10;
			count++;
		}

		return count;
	}
}
