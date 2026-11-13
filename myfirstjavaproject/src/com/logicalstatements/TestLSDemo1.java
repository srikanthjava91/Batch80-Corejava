package com.logicalstatements;

import java.util.Scanner;

//Q) WAP to check the Eligibility of end user for Voting/ Driving
public class TestLSDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();// 22
//
		if (age >= 18) {
			System.out.println("Congrtulations You are eligible for Voting/ Driving ");
		} else {
			System.out.println("Babu chitti, Pakkaki velli aduko !!");
			System.out.println("Have a nice day !!");
		}

		System.out.println("main method ended ");
	}

}
