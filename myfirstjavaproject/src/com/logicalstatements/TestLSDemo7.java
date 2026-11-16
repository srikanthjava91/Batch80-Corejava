package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Day : ");
		String day = sc.next();

		switch (day) {
		case "mon" -> {
			System.out.println("Monday's are Lazy days to work !");
			System.out.println("switch cases are very simple");
		}
		case "tue", "wed", "thur" -> System.out.println("Normal days to work !!");
		case "fri" -> System.out.println("Weekdne Mode started !! Just Chill at Office");
		case "sat", "sun" -> System.out.println("Holidays & Entertainment days !!");
		default -> System.out.println("Entered Day is not allowed ");
		}
	}

}
