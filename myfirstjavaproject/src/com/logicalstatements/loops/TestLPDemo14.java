package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to print sum of it's digits using WHile loop ..? 
//input : 123 
//output : 6 

public class TestLPDemo14 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		System.out.println("Sum of the digits is : " + digitSum(n));
	}

	static int digitSum(int n) {
		int sum = 0;
		int r = 0;

		// 123> 0

		while (n > 0) {
			r = n % 10;// 123%10 --> 3, 12%10--> 2, 1%10--> 1
			n = n / 10;// 123/10 --> 12,12/10 --> 1,1/10--> 0
			sum = sum + r;
		}

		return sum;
	}

}
