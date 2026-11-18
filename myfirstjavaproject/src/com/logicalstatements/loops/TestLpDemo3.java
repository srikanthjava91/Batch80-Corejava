package com.logicalstatements.loops;

//WAP to print even & odd numbers from 0 to 100 
public class TestLpDemo3 {

	public static void main(String[] args) {

		for (int x = 0; x <= 10; x++) {
			if (x % 2 != 0 && x != 0) {
				System.out.print(x + " ");
			}
		}
	}
}
