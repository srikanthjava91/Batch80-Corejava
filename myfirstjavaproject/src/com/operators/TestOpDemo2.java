package com.operators;

//byte short int long float double
//ii) Assignment Operators 
//  = += -= *= /= %=  
public class TestOpDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		int a = 10;
		System.out.println(a);

//		a = a + 5.5;//Type mismatch: cannot convert from double to int
//		a = (int) (a + 5.5);
//		//Double is converting to int automatically with compound operator which +=
//		will consider this concept as Narrowing.
		a += 5.5;// a = a + 5.5;
		System.out.println(a);// 15

//		a = a-3.5;
		a -= 3.5;// a = a - 3.5 = 11.5
		System.out.println(a);// 11

//		a = a * 2.5;
		a *= 2.5;// 11*2.5
		System.out.println(a);// 27

//		a = a/2.5;
		a /= 2.5; // 27/2.5
		System.out.println(a);// 10

//		a = a%1.5;
		a %= 1.5;// 10%1.5
		System.out.println(a);// 1

		double d1 = a;// int can convert to directly to double will consider as implcit type-casting
						// and also will consider as widening

	}
}
