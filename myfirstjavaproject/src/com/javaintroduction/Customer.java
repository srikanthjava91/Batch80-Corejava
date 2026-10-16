package com.javaintroduction;

public class Customer {

	int id;
	String name;

	@Override
	protected void finalize() {
		System.out.println("finalize method called ");
	}

	void hello() {

		System.out.println("heloo method called ");
		Customer c1 = new Customer();

	}

	public static void main(String[] args) {

		System.out.println("main method started ");
		Customer c1 = new Customer();
		System.out.println(c1);// 1dbd16a6

		Customer c2 = new Customer();
		System.out.println(c2);// 7ad041f3

		Customer c3 = new Customer();
		System.out.println(c3);// 251a69d7

//	Nullifying the Object 
		c1 = null;
//		c2 = null;
//		c3 = null;

		Customer c4 = new Customer();//
		System.out.println(c4);// 7344699f

//		Re-assigining the Object 
		c2 = c4;
		System.out.println(c2);
		System.out.println(c4);

//		Out of Scope 
		c4.hello();

//		Anonymous Object Creation 
		new Customer().hello();

//		Runs the garbage collector in the Java Virtual Machine
		System.gc();

		System.out.println("main method ended ");
	}
}
