package com.javaintroduction;

public class TestDemo3 {

//	CE : Native methods do not specify a body
//	Native methods executes in Native Method Stack Area with the help of JNI & native method Libraries.
//  Generally, native methods implementations can written C or C++ languages, 
//	SO with help of native method Libraries we can call those methods 
//	By calling native methods which declared in our program.
//	native void method1();

	void method1() {
		System.out.println("hello method1 ");
	}

	static {
		System.out.println("static block called");
		System.out.println("Welcome to Vcube !!");
	}

	{
		System.out.println("instance block called ");
		System.out.println("can you please show your ID Card ");
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		System.out.println(Thread.currentThread());

		TestDemo3 t1 = new TestDemo3();
		TestDemo3 t2 = new TestDemo3();

		t1.method1();
		t1.method1();
		t1.method1();
		t1.method1();
		t1.method1();
		t1.method1();
		t1.method1();
		t1.method1();
		t1.method1();
		t1.method1();

		System.out.println("main method ended ");

	}

}
