package com.languagefundamentals;

//A Java Developer can be a any Developer 
//but Any Developer cannot be a Java Developer 
//String Literals 
//String is collection of characters storing into a double quotes in a single variable.
public class TestLiteralsDemo4 {

	public static void main(String[] args) {
		////String Literals
		String s = "Java";
		String s1 = "Java";

		/////String Objects are storing inside the Heap 
		String s2 = new String("Srikanth");// 2 object created one is in SCP + 1 is in Heap
		String s3 = new String("Srikanth");//

		System.out.println(s == s1);// true
		System.out.println(s2 == s3);//false

	}

}
