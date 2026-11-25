package com.arrays;

//WAP to print to represent ages of student values..?
public class TestArrDemo1 {

	public static void main(String[] args) {
		System.out.println("main method stated ");

		int[] ages;// Declaration
		ages = new int[5];// 0 1 2 3 4 --> 0 0 0 0 0 //Creation

		// Initialize
		ages[0] = 22;
		ages[1] = 23;
		ages[2] = 21;
		ages[3] = 22;
		ages[4] = 21;
		ages[5] = 22;

		// Representation with for loop
//		for (int i = 0; i < ages.length; i++) {
//			System.out.println(ages[i]);
//		}

		// Representation with for each loop
		for (int age : ages) {
			if (age % 2 == 0) {
				System.out.println(age);
			}
		}

	}

}
