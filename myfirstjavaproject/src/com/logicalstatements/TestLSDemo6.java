package com.logicalstatements;

import java.util.Scanner;

//WAP to print Cricketer details based on jersey number .. ? 
public class TestLSDemo6 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Jersey number : ");

		int jno = sc.nextInt();

		switch (jno) {
		case 7:
			System.out.println("Mahendra SIngh Dhoni");
			System.out.println("Cool Indian Cricket Captain ");
			System.out.println("Thala for a Reason ");
			break;
		case 18:
			System.out.println("Virat Kohli ");
			System.out.println("Aggresive Crickter !!");
			System.out.println("GOAT ");
			break;
		case 45:
			System.out.println("Rohit Sharma ");
			System.out.println("Hit bastsman");
			System.out.println("Hitman");
			break;
		default:
			System.out.println("Entered Jersey number not available  ");

		}

		System.out.println("main method ened ");
	}
}
