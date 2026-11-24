package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to print fibonacci Series ..? 
//0 1 1 2 3 5 8 13 21 34 55 
public class TestLPDemo10 {

	static void fibbonacci(int n) {

		int n1 = 0;// 0 1 1 2
		int n2 = 1;// 1 1 2 3
		System.out.println(n1 + " " + n2);
		int count = 0;

		for (int i = 1; i <= n; i++) {
			count++;
			int n3 = n1 + n2;
			System.out.println(+n3 + "-" + count);// 1 2 3 5
			n1 = n2;
			n2 = n3;
		}

	}

	public static void main(String[] args) {
		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many values you want to print .?");
		int n = sc.nextInt();
		fibbonacci(n);

	}
}
