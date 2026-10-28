package com.languagefundamentals;

import java.math.BigInteger;
import java.math.BigDecimal;

class Dog {
	String name;
	
	Dog(String name){
		this.name = name;
	}

}

//Object Data Types 
//JVM Provides null values for every Java Object.
public class TestDataTypesDemo2 {

//	In Java, Collection of characters can store it into a single variable 
//	with double quotes will consider as String.

	String s = "Java is simple";// String Literals --> SCP --> String Constant Pool
	String s1 = new String("Vcube");// String with Object type --> Heap memory

	////Type mismatch: cannot convert from String to StringBuffer
//	StringBuffer sb = "Srikanth";
	StringBuffer sb1 = new StringBuffer("Srikanth");

	// Type mismatch: cannot convert from int to BigInteger
	BigInteger bi1 = new BigInteger("1764458679089889767565779879876765657868979867854");
	BigInteger bi2 = new BigInteger("1764458679089889767565779879876765657868979867854");

	BigDecimal bd1 = new BigDecimal("7968745586898096857654560870896576465457898.9875653565876987655646557878564546");
	BigDecimal bd2 = new BigDecimal("7968745586898096857654560870896576465457898.9875653565876987655646557878564546");

	
	Integer i = 100;//Converting Primitive data types into Wrapper Object Data types will consider : Auto-Boxing 
	int i1 = i;//Converting Wrapper Object data Types into Primitive data types will consider as Auto-Unboxing
	
	//Internally how Boxing is working !!
	Integer i2 = Integer.valueOf(100);
	int i3 = i2.intValue();
	
	
	Character c = 'A';
	Boolean boo = false;
	
	Dog d = new Dog("Puppy");

	public static void main(String[] args) {

		TestDataTypesDemo2 t2 = new TestDataTypesDemo2();
		System.out.println("String value : " + t2.s);// null
		System.out.println("String value : " + t2.s1);// null

		System.out.println("String Buffer Value : " + t2.sb1);// null

		System.out.println("BigInteger value : " + t2.bi1);// null
		System.out.println("BigInteger value : " + t2.bi2);// null

		// The operator + is undefined for the argument type(s) java.math.BigInteger,
		// java.math.BigInteger
//		System.out.println(t2.bi1+ t2.bi2);

		System.out.println("*****Addition of BigInteger values********");
		System.out.println(t2.bi1.add(t2.bi2));
		System.out.println("*****Multiplication of BigInteger values********");
		System.out.println(t2.bi1.multiply(t2.bi2));

		System.out.println("BigDecimal value : " + t2.bd1);// null
		System.out.println(t2.bd1.add(t2.bd2));

		System.out.println("Integer value : " + t2.i);// null
		System.out.println("Character value : " + t2.c);// null

		System.out.println("Boolean value : " + t2.boo);// null
		System.out.println("Dog Object value : " + t2.d.name);// null
	}

}
