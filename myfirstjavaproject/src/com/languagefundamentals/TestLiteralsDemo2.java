package com.languagefundamentals;

//Floating Literals 
public class TestLiteralsDemo2 {

	public static void main(String[] args) {

		float f = 10;// int --> float : ITC
		float f1 = 123.5f;
//		float f2 = 123.5;//CE : Because by default RHS Decimal point number are double, double cannot convert  to float.

		float f3 = 0123;//Octal--> int --> float 
		float f4 = 0123.5F;// The floating point data will not be a Octal or Hexa.

		float f5 = 0x123;
		
		float f6 = 123F;//Floating 
		float f7 = 0123F;//Floating
		float f8 = 0x123F;//Hexa-Decimal
		
//		float f9 = 0x123.5F;//Invalid hex literal number
//		float f10 = 0b1010F;//Syntax error on token "F", delete this token

		System.out.println(f);// 10.0
		System.out.println(f1);//
		System.out.println(f3);// 83.0
		System.out.println(f4);// 123.5
		System.out.println(f5);// 291.0
		System.out.println(f6);//123.0
		System.out.println(f7);//123.0
		System.out.println(f8);//
//		System.out.println(f10);//
	}

}
