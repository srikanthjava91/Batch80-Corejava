package com.operators;

//Unary Operators : + - ++ -- 
//pre-increment & post increment ---> ++
//pre-decrement & post decrement ---> --
public class TestUnaryOpDemo3 {

	public static void main(String[] args) {

		int a = 5;
		int b = 6;

//		unary plus --> Represents positive data  
		System.out.println(+a);// 5

//		unary minus --> represents Negative data 
		System.out.println(-b);// -6

		System.out.println(a++);// 5 --> 6
		System.out.println(++a);// 7

		System.out.println(--b);// 5
		System.out.println(b--);// 5 --> 4

		System.out.println(++a);// 8
		System.out.println(a++);// 8 --> 9
		System.out.println(++a);// 10
		System.out.println(++a);// 11
		System.out.println(a++);// 11 --> 12
		System.out.println(++a);// 13
		System.out.println(a++);// 13 --> 14
		System.out.println(++b);// 5
		System.out.println(--b);// 4
		System.out.println(--a);// 13
		System.out.println(a++);// 13 --> 14
		System.out.println(a--);// 14 --> 13
		System.out.println(a++);// 13 --> 14
		System.out.println(a--);// 14 --> 13
		System.out.println(++b);// 5

		System.out.println("A value : " + a);// 7 12 13
		System.out.println("B value : " + b);// 5 5 5

		System.out.println(++a + ++b + --a + --b);//20 + 13 +5 = 38 
		
		System.out.println(++a - ++b - ++a - --b);//14 - 6 -15 -5 = -12
	}

}
