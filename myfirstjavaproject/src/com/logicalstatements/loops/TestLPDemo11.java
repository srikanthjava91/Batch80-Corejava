package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to print up to 100 prime numbers ..? 
//Any number is Divisible by 1 and itself will consider as Prime..
public class TestLPDemo11 {

	static boolean isPrime(int n) {
		boolean status = true;

		if (n == 0 || n == 1) {
			return false;
		}

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}

		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Up to where you want to print ..? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}

	}

}
