package com.languagefundamentals;

//Primitive Data Types 
//byte --> short --> int --> long --> float --> double 
public class TestDataTyesDemo1 {

//	-128 to 127 values can store inside the byte value
//	By default RHS number values are the int type.
	byte b = 127;
	byte b1 = -128;

	// -128 -127 -126 -125----- -4 -3 -2 -1 0 1 2 3 .... 126 127
	////CE : Type mismatch: cannot convert from int to byte
	///// Explicit Type casting : converting Big values are storing into small data types
	byte b2 = (byte) 260;

//	Range of the short is : -32768 to 32767
//	Short means 2 bytes = 16 bits 
	short s = 32767;
	short s1 = -32768;
	////	Type mismatch: cannot convert from int to short
//	Explicit Type casting : Converting int to short.
	short s2 = (short) 32768;
//  Range of the int is : 2^31 = -2147483648 to 2147483647
//	int means 4 bytes = 32 bits 
	int i = 2147483647;
	int i1 = -2147483648;

//	int i2 = 2147483648;//The literal 2147483648 of type int is out of range 
	int i2 = (int) 2147483648L;

//	long means 8 bytes = 64 bits 
//	Rang of long is 2^63 = -9223372036854775808
	long l = 2147483648L;
	long l1 = 9223372036854775807L;

	// RHS decimal point numbers are double
	// Type mismatch: cannot convert from double to float
//	float f = 45.56789008754467345;
	float f = 45.56789008754467345F;
	double d = 45.56789008754467345;

	float f1 = 922337203685477580988776877F;
	float f2 = 10;// int can store it into float : Implicit Type casting : The small values are
					// storing it into big data types directly will consider as Implicit Type
					// Catsing .

	double d2 = 55.5F;// Implicit type casting : float --> double

	// char is 2 bytes = 16 bits
//	char range is -32678 to 32767 = 0 to 65535 
	char c = 'A';// single quote characters

	char c1 = 65535;// ASCII code characters
//	char c2 = 65536;//Type mismatch: cannot convert from int to char
	char c3 = '\u0040';// unicode or Hex values
	char c4 = '\u2f2a';

	int x = 'A';
	
	boolean boo = false;

//	boolean boo1 = "false";
//	boolean boo2 = "true";
//	boolean boo3 = True;
//	boolean boo4 = False;
//	boolean boo5 = 0;
//	boolean boo6 = 1;
//	boolean boo7 = TRUE;
//	boolean boo8 = False;
	
	public static void main(String[] args) {

		TestDataTyesDemo1 t1 = new TestDataTyesDemo1();
		System.out.println(t1);// 2b2fa4f7

		if (t1.boo) {
			System.out.println("Good morning !!");
		}

		System.out.println("byte value is : " + t1.b);// 0
		System.out.println("byte value is : " + t1.b1);// 0
		System.out.println("byte value is : " + t1.b2);// 0

		System.out.println("short value is : " + t1.s);// 0
		System.out.println("int value is : " + t1.i);// 0
		System.out.println("int value is : " + t1.x);// 0
		
		System.out.println("long value is : " + t1.l);// 0

		System.out.println("float value is : " + t1.f);// 0.0
		System.out.println("float value1 is : " + t1.f1);// 0.0

		System.out.println("double value is : " + t1.d);// 0.0
		System.out.println("char value is : " + t1.c);//
		System.out.println("char value is : " + t1.c1);//
		System.out.println("char value is : " + t1.c3);//
		System.out.println("char value is : " + t1.c4);//

		System.out.println("boolean value is : " + t1.boo);// false

	}

}
