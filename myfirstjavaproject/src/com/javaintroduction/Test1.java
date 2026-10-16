package com.javaintroduction;

//forName(String className) : Returns the Class object associated with the class with the given String name
public class Test1 {

	public static void main(String[] args) throws ClassNotFoundException {

		System.out.println("main method started ");

		System.out.println(Class.forName("java.lang.System"));
		System.out.println(Class.forName("java.lang.String"));

		System.out.println(Class.forName("com.javaintroduction.Student"));
		System.out.println(Class.forName("com.javaintroduction.Welcome"));

		System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));

//		System.out.println(Class.forName("com.javaintroduction.Employee"));

		System.out.println("main method ended ");

	}

}
