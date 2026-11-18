package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to print factors of Given number ..? 
//input is : 6 
//output : 1 2 3 6 

//input :  24
//output : 1 2 3 8 4 6  12 24 
public class TestLpDemo4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}

	}

}
