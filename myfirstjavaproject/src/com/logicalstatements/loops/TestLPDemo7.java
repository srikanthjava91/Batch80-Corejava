package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to print math table ..? 
//If your input is 9 
//your output should be 
//9 X 1 = 9
//9 X 2 = 18
//9 X 3 = 27
//9 X 4 = 36
//9 X 5 = 45
//9 X 6 = 54
//9 X 7 = 63
//9 X 8 = 72
//9 X 9 = 81
//9 X 10 = 90
public class TestLPDemo7 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Which number you want to calculate ..?  ");
		int n1 = sc.nextInt();// 9

		System.out.println("How many values you want to print ");
		int n2 = sc.nextInt();// 10

		for (int i = 1; i <= n2; i++) {
			System.out.println(n1 +" X " + i + " = " + n1*i);
		}

	}
}
