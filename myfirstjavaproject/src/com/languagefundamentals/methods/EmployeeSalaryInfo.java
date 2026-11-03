package com.languagefundamentals.methods;

import java.util.Scanner;

//300+ methods with 15+ classes 
//iii) WIth return type & NO Parameters
//WAP to print Employee Total Salary which include all aspects.

public class EmployeeSalaryInfo {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("main method strated ");

		EmployeeSalaryInfo es = new EmployeeSalaryInfo();

		double bs = es.getBasicSalary();
		double hra = es.getHouseRentAllowance();
		double lta = es.getLeaveTravelAssistance();
		double sa = es.getSpecialAllowance();
		double mc = es.getMealCoupons();
		double pf = es.getProvidentFund();
		double grt = es.getGratuity();

		double total_salary = bs + hra + lta + sa + mc + pf + grt;

		System.out.println("Total Salary is : " + total_salary);

		System.out.println("main method ended ");
	}

	double getGratuity() {
		System.out.println("Enter Gratuity : ");
		double gr = sc.nextDouble();
		return gr;

	}

	double getProvidentFund() {
		System.out.println("ENter PF AMount : ");
		double pf = sc.nextDouble();
		return pf;
	}

	double getMealCoupons() {
		System.out.println("Get Meal COupons AMount : ");
		double mc = sc.nextDouble();
		return mc;
	}

	double getSpecialAllowance() {
		System.out.println("Enter Special ALlownces : ");
		double sa = sc.nextDouble();
		return sa;
	}

	double getLeaveTravelAssistance() {
		System.out.println("ENter LTA  ");
		double lta = sc.nextDouble();
		return lta;
	}

	double getHouseRentAllowance() {
		System.out.println("Enter your HRA : ");
		double hra = sc.nextDouble();
		return hra;
	}

	double getBasicSalary() {
		System.out.println("Enter Your Basic salary : ");
		double basic = sc.nextDouble();
		return basic;

	}
}
