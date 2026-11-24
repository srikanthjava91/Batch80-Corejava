package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to convert Decimal to Binary 
//input is 10 --> 1010 
//                2^3+2^2+2^1+2^0
public class TestLPDemo18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();// 10
		int r = 0;
		String binary = "";

		while (n > 0) {
			r = n % 2;// 10%2=0, 5%2=1, 2%2=0, 1%2=1
			n = n / 2;// 10/2=5, 5/2=2, 2/2=1, 1/2=0
			binary = r + binary;
		}

		System.out.println("The binary value of Given number is : " + binary);
	}

}
