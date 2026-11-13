package com.logicalstatements;

import java.util.Scanner;

//Nested if else combinations 
//WA POC related  to Matrimonial management : (Proof Of Concept) 
public class TestLSDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		System.out.println("Welcome to Vcube Matrimonial Site ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String fullname = sc.nextLine();

		System.out.println("Oh !! Nice Meet you mr." + fullname);

		System.out.println("Enter your assets information : ");
		double assets = sc.nextDouble();

		if (assets >= 50000000.00) {
			System.out.println("Oh okay !! ");
			System.out.println("Let's continue the discussion!!");

			System.out.println("Enter your salary : ");
			double salary = sc.nextDouble();

			if (salary >= 2500000.00) {
				System.out.println("Nice to continue the discussion !!");

				System.out.println("Enter your age : ");
				int age = sc.nextInt();
				if (age >= 25 && age <= 29) {
					System.out.println("Okay Good to go !!");

					System.out.println("Enter your height & Weight ");
					float height = sc.nextFloat();
					double weight = sc.nextDouble();

					if ((height >= 5.5 && height <= 6.1) && weight >= 65 && weight <= 72) {
						System.out.println("Nice to hear the deatils about your !! Lets continue with more Questions");

						System.out.println("do you have siblings !!");
						boolean sibStatus = sc.nextBoolean();

						if (!sibStatus) {
							System.out.println("ufff happy to hear ");
							System.out.println("Wiil connect later will take all the info ");
						} else {
							System.out.println("OMG");
						}

					} else {
						System.out.println("You must need to Gym !!");
					}

				} else {
					System.out.println("Sorry !! ");
				}

			} else {
				System.out.println("Your profile is not matching with our daughters Profile!");
			}

		} else {
			System.out.println("Babu pakkaki velli aduko !!");
			System.out.println("Your profile is not matching !");
		}

	}
}
