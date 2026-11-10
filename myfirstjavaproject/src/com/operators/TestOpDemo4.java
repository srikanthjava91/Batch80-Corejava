package com.operators;

//iv) comparison Operators --> boolean expressions
//== != < <= > >= 
//== operator check the values if the data is Primitive.
//== operator check the addresses if the data is Object types.
public class TestOpDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		String s1 = new String("Srikanth");
		String s2 = new String("srikanth");
		System.out.println(s1 == s2);// false --> here, Checking the addresses
		System.out.println(s1.equals(s2));// equals() from String class checks the content
		System.out.println(s1.equalsIgnoreCase(s2));// equalsIgnoreCase() from String class checks the content

		int a = 10;
		int b = 20;
		int c = 10;

		System.out.println(a == c);// true --> here, Checking the values
		System.out.println(a != c);// false

		System.out.println(a > b);// 10>20 --> false
		System.out.println(a >= b);// 10>=20 --> false

		System.out.println(a < b);// 10<20 --> true
		System.out.println(a <= c);// 10<=10 --> true
		System.out.println(a < c);// 10<10 --> false

		System.out.println("main method ended ");
	}

}
