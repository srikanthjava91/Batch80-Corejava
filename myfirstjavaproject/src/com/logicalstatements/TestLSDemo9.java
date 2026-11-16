package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo9 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks P  ");

		int marksP = sc.nextInt();

		// Cannot switch on a value of type double.
//		Only convertible int values, strings or enum variables are permitted
		String grade = switch (marksP / 10) {

		case 9 -> {
			System.out.println("Its'Very good result : ");
			yield "Garde A";
		}
		case 8 -> {
			System.out.println(" good result : ");
			yield "Garde B";
		}
		case 7 -> {
			System.out.println("Its' Okay  result : ");
			yield "Garde C";
		}
		case 6, 5, 4 -> {
			System.out.println("Results are not good : ");
			yield "Garde D";
		}

		default -> {
			System.out.println("The user is Failed : ");
			yield "Failed";
		}

		};

		System.out.println("The Grade is : " + grade);

	}

}
