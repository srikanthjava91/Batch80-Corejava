package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to find the Given number isArmstrong number or not ..? 
//371 --> 3^3 + 7^3 + 1^3 = 27 + 343  + 1 = 371
//370 --> 3^3 + 7^3 + 0^3 = 27 + 343  + 0 = 370
//1634 --> 1^4 + 6^4 + 3^4 + 4^4 = 1634
public class TestLPDemo17 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		boolean status = isArmstrong(n);

		if (status) {
			System.out.println("The Given number is Armstrong number : ");
		} else {
			System.out.println("The Given number is not Armstrong number : ");
		}

		System.out.println("main method ended !!");

	}

	public static boolean isArmstrong(int n) {
		boolean status = false;

		String str = Integer.toString(n);
		int count = str.length();
		int r = 0;
		int sumP = 0;
		int temp = n;

		while (n > 0) {
			r = n % 10;
			n = n / 10;
			sumP = (int) (sumP + Math.pow(r, count));
		}
		
		if(sumP == temp) {
			status = true;
		}

		return status;
	}

}
