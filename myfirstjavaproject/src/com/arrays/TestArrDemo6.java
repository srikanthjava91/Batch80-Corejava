package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TestArrDemo6 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of an array : ");
		int size = sc.nextInt();// 10

		int[] numbers = new int[size];// 0 1 2 3 4 5 6 7 8 9

		System.out.println("Enter the values  : ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(numbers));
	}
}
