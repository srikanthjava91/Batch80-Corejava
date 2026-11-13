package com.operators;

import java.util.Scanner;

//Ternary operators 
//syntax : (condition)?value1:vaue2;
public class TestOpDemo8 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age : ");
		int age = sc.nextInt();

		int a = 100;
		int b = 20;
		int c = 300;
		int max = (a > b) ? a : b;
		System.out.println("Max value is : " + max);

		int max1 = (a > b && a > c) ? a : (b > c) ? b : c;
		System.out.println("Max1 is : " + max1);

		String isELigible = (age > 18) ? "YES" : "NO";
		System.out.println("Is The person ELigible for Voting ..? " + isELigible);

	}

}
