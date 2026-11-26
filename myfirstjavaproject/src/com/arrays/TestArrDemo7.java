package com.arrays;

import java.util.Scanner;

//Q) WAP to find Given element is Available in an array or not ..? 
public class TestArrDemo7 {

	public static void main(String[] args) {
		int[] arr = { 7, 18, 45, 33, 4, 77, 8, 1, 9, 66, 99 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter jersey number Whether it is availble or not ..? ");
		int jno = sc.nextInt();

		boolean found = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == jno) {
				System.out.println("Jersy number found from my Team at index: " + i);
				found = true;
				break;
			}
		}
		
		if(!found) {
			System.out.println("The Given number Jersey number not found !!=");
		}

	}

}
