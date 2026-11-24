package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to print Reverse number of Given number ..? 
//1234 --> 4321 
//6789 --> 9876
//WAP to check the Given number is Palindrome or not ..? 
//123 --> false 
//111 --> true 
//232 --> true 
public class TestLPDemo15 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int rev = revNum(n);

		System.out.println("Reverse Number is : " + rev);

		if (n == rev) {
			System.out.println("The Given number is Palindrome : ");
		} else {
			System.out.println("The Given number is not a Palindrome !");
		}

	}

	static int revNum(int n) {
		int rev = 0;
		int r = 0;

		while (n > 0) {
			r = n % 10;
			n = n / 10;
			rev = rev * 10 + r;
		}

		return rev;
	}

}
