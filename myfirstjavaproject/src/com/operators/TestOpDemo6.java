package com.operators;

//Bitwise Operators  : & | ^ ~ 

// Bitwise Operators working between both values & conditions 
public class TestOpDemo6 {

	public static void main(String[] args) {

		System.out.println("***********Bitwise And & *****************");
		System.out.println(true & true);// true
		System.out.println(true & false);// false
		System.out.println(false & true);// false
		System.out.println(false & false);// false

		System.out.println("----------------------");
		System.out.println(1 & 1);// 1
		System.out.println(1 & 0);// 0
		System.out.println(0 & 1);// 0
		System.out.println(0 & 0);// 0

		System.out.println("----------------------");

		System.out.println(73 & 27);// 9
		System.out.println(82 & 15);// 2
		System.out.println(95 & 62);// 30
		System.out.println(89 & 22);// 16

		System.out.println("***********Bitwise OR | *****************");
		System.out.println(true | true);// true
		System.out.println(true | false);// true
		System.out.println(false | true);// true
		System.out.println(false | false);// false

		System.out.println("----------------------");
		System.out.println(1 | 1);// 1
		System.out.println(1 | 0);// 1
		System.out.println(0 | 1);// 1
		System.out.println(0 | 0);// 0

		System.out.println("----------------------");

		System.out.println(73 | 27);
		System.out.println(82 | 15);// 95
		System.out.println(95 | 62);// 127
		System.out.println(89 | 22);// 95

		System.out.println("***********Bitwise XOR  ^*****************");
		System.out.println(true ^ true);// false
		System.out.println(true ^ false);// true
		System.out.println(false ^ true);// true
		System.out.println(false ^ false);// false

		System.out.println("----------------------");
		System.out.println(1 | 1);// 0
		System.out.println(1 | 0);// 1
		System.out.println(0 | 1);// 1
		System.out.println(0 | 0);// 0

		System.out.println("----------------------");

		System.out.println(73 ^ 27);
		System.out.println(82 ^ 15);//93
		System.out.println(95 ^ 62);// 97
		System.out.println(89 ^ 22);// 79
		
		System.out.println("Bitwie tilt ~");
		System.out.println(~10);// -(n+1)
		

	}

}
