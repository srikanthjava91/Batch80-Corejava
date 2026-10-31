package com.languagefundamentals;

//Integral Literals
public class TestLiteralsDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started !");

//		A normal numbers can consider as Decimal literals Base is 10 
//		numbers from 0 to 9 
		int a1 = 123;
		int a2 = 789;
		int a3 = 1230;

//		Octal Literals : Any numbers starts with 0 will consider as Octal Literals.
//		Octal Literals Base is 8, Range is 0 to 7 
//		Calculation : 0 + 1*8^2 +2*8^1 +3*8^0 = 64 + 16 + 3 = 83  
		int a4 = 0123;
		int a5 = 0567;// 375
		int a6 = 0657;// 431
//		int a7 = 0786;//518//The literal 0786 of type int is out of range 
//		int a8 = 0912;//586//The literal 0912 of type int is out of range 

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);

//		Hexa-Decimal Literals : Any numbers starts with 0X or 0x will consider as Hexa-Decimal Literlas.
//		Hexa-Decimal Literals Base is 16, The range is 0-9 and a-f/A-F--> a=10, b=11, c=12, d =13, e =14, f=15

//		0 +  1*16^2 +2*16^1 +3*16^0 = 256 + 32 + 3 = 291
		int a7 = 0X123;

//		0 1*16^5 +10*16^4 +2*16^3 +11*16^2 +3*16^1 +12*16^0 = 1715004
		int a8 = 0x1a2b3c;

		int a9 = 0xBee;
		int a10 = 0XDAD;
//		int a11 = 0x5GF;//Syntax error on token "GF", delete this token

//		Binary Literals  : Any number starts with 0b will consider as Binary literals 
//		The base is 2 and the range is 0-1

//		 1*2^3 +0+2^2 +1*2^1 +0*2^0 = 8 + 2 = 10 
		int a12 = 0b1010;
		int a13 = 0b101101110101;

		System.out.println(a7);
		System.out.println(a8);
		System.out.println(a9);
		System.out.println(a10);
		System.out.println(a12);
		System.out.println(a13);

		System.out.println("main method ended");
	}

}
