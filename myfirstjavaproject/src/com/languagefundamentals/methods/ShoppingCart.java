package com.languagefundamentals.methods;

import java.util.Scanner;

public class ShoppingCart {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to vcube Shopping Mart: ");

		ShoppingCart s = new ShoppingCart();

		double mp = s.getMobilesInfo();
		double wp = s.watchesInfo();

		System.out.println("Tota Bill is : " + (mp + wp));

	}

	double watchesInfo() {
		double totalWatchesPrices = 0;
		System.out.println("ENter each Watch price:  ");
		double watchPrice = sc.nextDouble();

		System.out.println("ENter Quantity : ");
		int qty = sc.nextInt();

		totalWatchesPrices = qty * watchPrice;

		return totalWatchesPrices;
	}

	double getMobilesInfo() {
		double mobilesPrice = 0;

		System.out.println("Mobile price : ");
		double mobilePrice = sc.nextDouble();

		System.out.println("Enter Quantiy : ");
		int qty = sc.nextInt();

		mobilesPrice = qty * mobilePrice;

		return mobilesPrice;
	}
}
