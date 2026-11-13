package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();

		if (age < 0) {
			System.out.println("Invalid age : ");
		} else if (age >= 0 && age <= 5) {
			System.out.println("You are kid !!");
		} else if (age > 5 && age <= 12) {
			System.out.println("You are Children!!");
		} else if (age >= 13 && age <= 19) {
			System.out.println("You are Teen age!!");
		} else if (age >= 20 && age <= 35) {
			System.out.println("You are Young!!");
		} else if (age >= 36 && age <= 60) {
			System.out.println("You are Middle age!!");
		} else if (age > 60) {
			System.out.println("You are Senior Citizen !!");
		}

	}

}
