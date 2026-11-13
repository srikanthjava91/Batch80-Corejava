package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("are you coming to the classes Regularly ..? ");
		boolean areYouregularToTheClasses = sc.nextBoolean();

		System.out.println("are you attending Weekly Test Every Week Without missing one week ..? ");
		boolean areYouRegularToTheWeeklyTest = sc.nextBoolean();

		System.out.println("Are you attending Mock Interviews Without Failing one Week ..? ");
		boolean areYouRegularForMock = sc.nextBoolean();

		System.out.println("Are you Practicing Daily 4 to 6 hrs ..? ");
		boolean arePractising = sc.nextBoolean();

		if (areYouregularToTheClasses && areYouRegularToTheWeeklyTest && areYouRegularForMock && arePractising) {
			System.out.println("VCube Promising Job Gaurentee !!!");
			System.out.println("You will get Job in 6 to 8 month 100% G");
		} else {
			System.out.println("You are Cheating Your Parents without mask !!");
		}

	}

}
