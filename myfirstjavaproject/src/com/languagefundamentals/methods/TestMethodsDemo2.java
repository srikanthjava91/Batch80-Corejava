package com.languagefundamentals.methods;

///i) No-return type & No Parameters
///In Java + - */ % are the Arithmetic Operators.
//WAP calculate the values using methods..?   
public class TestMethodsDemo2 {

	void addition() {
		System.out.println("Addition method called");
		int a = 10;
		int b = 20;
		System.out.println(a + b);
	}

	void subtraction() {
		System.out.println("subtraction method called ");
		int a = 100;
		int b = 50;
		System.out.println(a - b);
	}

	void multiplication() {
		System.out.println("multipliation method called ");
		int a = 10;
		int b = 50;
		System.out.println(a * b);
	}

//	Division will give you Quotient. 100/5 = 20 
	void division() {
		System.out.println("division method called ");
		int a = 100;
		int b = 5;
		System.out.println(a / b);
	}

//	Modulus will give you Reminder 98%8 = 2 
//	56%76 = 56 
//	56/76 = 0 
	void modulus() {
		System.out.println("modulus method called ");
		int x = 98;
		int y = 8;

		System.out.println(x % y);

	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		TestMethodsDemo2 t = new TestMethodsDemo2();

		t.addition();
		t.subtraction();
		t.multiplication();
		t.division();
		t.modulus();

		System.out.println("main method ended ");

	}

}
