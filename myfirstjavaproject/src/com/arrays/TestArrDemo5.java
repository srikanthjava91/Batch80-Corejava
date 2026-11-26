package com.arrays;

//Q) WAP to print min & Max Array ..? 
public class TestArrDemo5 {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 3, 1 };

		int min = arr[0];// 2
		int max = arr[0];// 2

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			} else if (arr[i] > max) {
				max = arr[i];
			}

		}

		// for each loop
//		for (int a : arr) {
//			if (a < min) {
//				min = a;
//			} else if (a > max) {
//				max = a;
//			}
//		}

		System.out.println("Min value from an Array is : " + min);
		System.out.println("Max value from an Array is : " + max);

	}

}
