package com.arrays;

//WAP to print sum of the Marks and avg of given Student marks..? 
//99 98 97 96 95 94 
public class TestArrDemo3 {

	public static void main(String[] args) {

		int[] marks = { 99, 98, 97, 96, 95, 94 };
		System.out.println(marks);// [I@2b2fa4f7

		double sum = 0;
		double avg = 0;

		for (int i = 0; i < marks.length; i++) {
			sum = sum + marks[i];
		}

//		for (int m : marks) {
//			sum += m;// 99+98= 197+97=294+96 = 390+95 = 485+ 94 = 579
//		}

		avg = sum / marks.length;

		System.out.println("SUm of the marks : " + sum);
		System.out.println("Avg of all the marks : " + avg);
	}
}
