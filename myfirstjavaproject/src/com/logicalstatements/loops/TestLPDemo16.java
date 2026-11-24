package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to print Armstrong number of Given number ..? 
//Armstrong number means : sum of it's digits where each digit whole to the power it's number of digits count.

//153 --> 3 --> 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 
//371  --> 
//370  --> 
//1634 --> 
public class TestLPDemo16 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int armStrong = armStrongNumber(n);

		if (n == armStrong) {
			System.out.println("The Given number is Armstrong  ");
		} else {
			System.out.println("The Given number is not an Armstrong  ");
		}

	}

	static int armStrongNumber(int n) {
		int r = 0;
		int count = 0;
		int n1 = n;
		int sumP = 0;

		while (n > 0) {
			n = n / 10;
			count++;
		}

		while (n1 > 0) {
			r = n1 % 10;
			n1 = n1 / 10;
			sumP = (int) (sumP + Math.pow(r, count));

		}

		return sumP;
	}
}
