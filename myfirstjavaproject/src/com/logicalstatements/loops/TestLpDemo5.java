package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to print factors of Given number ..? 
//input is : 6 
//output : 1 2 3 6 
//Time Complexity is :O(n) 
//Space Complexity is : O(1)
public class TestLpDemo5 {

	void factors(int n) {
		for (int i = 1; i < n / 2; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println(n);
	}

	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();// 6
		factors(n);
	}

}
