package com.operators;

//logical Operators : && || ! --> Boolean Expressions 
//Logical Operators working between the Conditions or Expressions an resulted values are Boolean Expression
public class TestOpDemo5 {

	public static void main(String[] args) {

		int x = 10;
		int y = 15;
		int z = 20;

		System.out.println("***************Logical And (&&)*********");
//		System.out.println(0 && 1);//CE : The operator && is undefined for the argument type(s) int, int
		System.out.println(true && true);// true
		System.out.println(true && false);// false
		System.out.println(false && true);// false and 2nd condition is Dead code.
		System.out.println(false && false);// false

		System.out.println("----------------------");
		System.out.println(x < y && y < z);// true
		System.out.println(x < y && y > z);// false
		System.out.println(x > y && y < z);// false
		System.out.println(x > y && y > z);// false

		System.out.println("***************Logical OR (||)*********");
		System.out.println(true || true);// true --> 2nd part is Dead code
		System.out.println(true || false);// true --> 2nd part is Dead code
		System.out.println(false || true);// true
		System.out.println(false || false);// false

		System.out.println("----------------------");
		System.out.println(x < y || y < z);// true
		System.out.println(x < y || y > z);// true
		System.out.println(x > y || y < z);// true
		System.out.println(x > y || y > z);// false

		System.out.println("----------------------");
		System.out.println(!true);// false
		System.out.println(!false);// true
		System.out.println(!(x < y));//false
		System.out.println("----------------------");

		int a = 10;
		System.out.println(++a < 15 || ++a < 15);
		System.out.println(a);// 11
		System.out.println(++a > 15 || ++a < 15);// 2nd part of the code is Dead code
		System.out.println(a);// 13

	}
}
