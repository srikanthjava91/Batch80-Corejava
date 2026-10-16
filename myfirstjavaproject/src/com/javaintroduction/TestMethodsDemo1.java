package com.javaintroduction;


//static methods are storing inside the method area 
//instance methods are storing inside the heap area 
//but all methods are executing inside the stack area.. 
//local variable are there inside the methods so local variables are also storing inside stack area.
public class TestMethodsDemo1 {

	// static method
	public static void hello() {
		System.out.println("Hello Sandeep, Good Morning ");
		System.out.println(Thread.currentThread());
	}

	

	public static void main(String[] args) {
		System.out.println("main method started ");
		hello();
		System.out.println(Thread.currentThread());

//		In static methods, we cannot call instance methods directly.
//		If we want to call instance methods in static area, we must need to call by using Object reference varible.
//		CE : Cannot make a static reference to the non-static method welcome()
//		from the type TestMethodsDemo1
//		welcome();

		TestMethodsDemo1 t1 = new TestMethodsDemo1();
		t1.welcome();
		System.out.println("main method ended ");
	}
	
	// instance methods
		void welcome() {
			System.out.println("welcome to methods !");
			System.out.println(Thread.currentThread());
		}

}
