package com.arrays;

import java.util.Arrays;

//Q) WAP to print Array in Reverse Order ..? 
//input : 12345678 
//output : 87654321
//---------------------------
// 8 2 3 4 5 6 7 1 
// 8 7 3 4 5 6 2 1 
// 8 7 6 4 5 3 2 1 
// 8 7 3 5 4 3 2 1
public class TestArrDemo4 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };// 0 1 2 3 4 5 6 7 --> 7 6 5 4 3 2 1 0
		int temp = 0;

//		for (int i = arr.length - 1; i >= 0; i--) {
//			System.out.print(arr[i] +" ");
//		}

		int start = 0;// 0
		int end = arr.length - 1;// 7

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		System.out.println("After Reverse : " + Arrays.toString(arr));
		

	}

}
