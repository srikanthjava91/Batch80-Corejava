package com.languagefundamentals.methods;

public class TestMethodsDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		
//		static method loaded whenever the class loads.
		hello();//Calling the method : static methods can call directly
		
//		Cannot make a static reference to the non-static method welcome() from the type TestMethodsDemo1
//		If we want to call instance methods, we must need to create Objects.
//		Whenever we created an Objects instance methods are loading into the Heap memory.
		TestMethodsDemo1 t = new TestMethodsDemo1();
		t.welcome();
		
		System.out.println("main method ended !!");
	}
	
	public static void hello() {
		System.out.println("Good morning have a nice day !!");
	}
	
	void welcome() {
		System.out.println("Welcome to Java World ");
	}

}
