package com.languagefundamentals.methods;

import java.util.Scanner;

//WAP to print BankAccount details and Operations..? 
// Withdraw 
//Deposit 
//checkBalance 
public class BankAccount {

	double balance = 20000.00;

	public static void main(String[] args) {
		System.out.println("main method started !!");

		BankAccount b = new BankAccount();
		b.checkBalance();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how much you want withdraw ..? ");
		double wamt = sc.nextDouble();
		b.withdraw(wamt);

		System.out.println("ENter how much you want to Deposite ..?");
		double damt = sc.nextDouble();
		b.deposite(damt);

		System.out.println("main method ended !!");
	}

	void deposite(double damt) {

		if (damt > 1000) {
			balance = balance + damt;
		} else {
			System.out.println("You must need Deposit above 1000/-");
		}

		checkBalance();
	}

	void withdraw(double wamt) {

		if (wamt <= balance) {
			balance = balance - wamt;
		} else {
			System.out.println("Insufficient funds : ");
		}

		checkBalance();
	}

	void checkBalance() {
		System.out.println("The Current balance is : " + balance);
	}

}
