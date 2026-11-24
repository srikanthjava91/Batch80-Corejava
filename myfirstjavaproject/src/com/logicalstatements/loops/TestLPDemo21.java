package com.logicalstatements.loops;

///WAP to swap one variable value into another variable 
public class TestLPDemo21 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

//		int temp = 0;
//		temp = a;
//		a = b;
//		b = temp;

//		a = a + b;
//		b = a - b;
//		a = a - b;

		// XOR
		//1010 
		//
		a = a ^ b;//30
		b = a ^ b;//10
		a = a ^ b;//20

		System.out.println("A value: " + a);
		System.out.println("B value: " + b);
	}
}
