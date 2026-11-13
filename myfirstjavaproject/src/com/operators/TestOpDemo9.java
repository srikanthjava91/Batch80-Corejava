package com.operators;

//The instanceof operator in Java is a binary operator used 
//to check whether an object is an instance of a specific class, 
//subclass, or interface. 

//It is also referred to as a type comparison operator because it compares an object with a given type and returns a boolean value (true or false). 
//This operator is particularly useful for ensuring type safety before performing operations like typecasting, thereby avoiding runtime exceptions such as ClassCastException.

class A {
	
}

class B extends A {
	
}

public class TestOpDemo9 {

	public static void main(String[] args) {

		Integer i = 10;
		System.out.println(i instanceof Integer);// true
		System.out.println(i instanceof Number);// true
		System.out.println(i instanceof Object);// true
//		Incompatible conditional operand types Integer and String
//		System.out.println(i instanceof String);//CE : 
		System.out.println(null instanceof Integer);
		
		B b = new B();
		A a = new A();
		System.out.println(b instanceof B);
		System.out.println(b instanceof A);
		System.out.println(a instanceof A );
		System.out.println(a instanceof B);//false

	}

}
