package com.languagefundamentals;

//The Comparison Operators will return boolean expressions.
//== operator checks for content comparison if the data is Primitive.
//== operator checks for Addresses of the Object data types but not the content.
public class TestDataTypesDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		int a = 10;
		int b = 10;

		System.out.println(a == b);// true

//		Wrapper Caching -128 to 127 will use same memory.
		Integer i1 = 100;
		Integer i2 = 100;
		System.out.println(i1 == i2);//true
		
		Integer i3 = 150;//56789
		Integer i4 = 150;//875765457
		System.out.println(i3 == i4);//false
		System.out.println(i3.equals(i4));

	}

}
