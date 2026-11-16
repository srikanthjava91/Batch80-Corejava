package com.logicalstatements;

import java.util.Scanner;

//WAP to print calculated values as a result based two values..?
public class TestLSDemo8 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		String yn = "";

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number ");
			int a = sc.nextInt();

			System.out.println("Enter b number ");
			int b = sc.nextInt();

			int result = 0;

			System.out.println("Enter a symbol to proceed : like + - * / %  ");
			String symb = sc.next();

			switch (symb) {

			case "+" -> result = a + b;
			case "-" -> result = a - b;
			case "*" -> result = a * b;
			case "/" -> result = a / b;
			case "%" -> result = a % b;
			default -> System.out.println("Entered Symbol not valid !!");

			}

			System.out.println("The Resulted Value is : " + result);
			System.out.println("Do you want to conntinue ..? Ckick Y for Yes N for No");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));
		
		

//		System.out.println("result is : " + result);

		System.out.println("main method ended ");
	}
}
