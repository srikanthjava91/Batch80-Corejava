package com.languagefundamentals;

//char Literals 
public class TestLiteralsDemo3 {

	public static void main(String[] args) {

		String s1 = null;// null literals can helpful for Object data types but nit for primitive data
							// types.
		TestLiteralsDemo3 t1 = null;
		
		System.out.println("*******************************");
		boolean boo = false;// true or false are the boolean literals.
		if (boo) {
			System.out.println("Hello !!");
		}
		System.out.println("*******************************");
		char c1 = 'A';// Single Quote Characters
		char c2 = 65535;// ASCII code characters
		char c3 = '\u0040';// Uni-code characters or Hexa values
		char c4 = '\u1a2b';

		s1 = "Srikanth";

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

		System.out.println(s1);
		
		
		t1= new TestLiteralsDemo3();
		

	}

}
