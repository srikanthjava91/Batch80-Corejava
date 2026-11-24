package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to find the Given number is Perfect or not ..? 
//A perfect is a number which is equals to sum of it's factors excluding the given number.
//ex: 6 --> 1 2 3 = 6  --> true 
//ex: 28 --> 1 2 4 7 14 = 28 --> true 
//ex: 24 --> 1 2 3 4 6 8 12 = 36 --> false 
public class TestLPDemo6 {

	static boolean isPerfect(int n) {
		boolean status = false;
		int sum = 0;

		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}

		if (sum == n) {
			status = true;
		}

		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();// 6

		boolean flag = isPerfect(n);

		if (flag) {
			System.out.println("The Given number is Perfect ");
		} else {
			System.out.println("The Given number is not Perfect ");
		}

	}

}
