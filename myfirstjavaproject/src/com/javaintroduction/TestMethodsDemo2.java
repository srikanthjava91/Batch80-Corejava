package com.javaintroduction;

public class TestMethodsDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		method1();
		System.out.println("main method ended ");
	}

	// in static methods, yes we can call static methods directly.
	public static void method1() {
		method2();
		System.out.println("method1 called ");
	}

//	in static methods, we cannot call instance methods without object.
//	we must need to create object to call instance methods in static area.
	static void method2() {
		TestMethodsDemo2 t = new TestMethodsDemo2();
		t.method3();
		System.out.println("method2 called ");
	}

//	// in instance method, yes we can call instance methods directly
	void method3() {
		method4();
		System.out.println("method3 called ");
	}

//	in instance, can we call static methods directly ..? YES 
	void method4() {
		System.out.println("method4 called ");
		method5();
	}
	
	static void method5() {
		System.out.println("method5 called ");
	}

}
