package com.languagefundamentals.constructor;

public class Employee {

	int eid;
	String ename;
	double esal;

	Employee() {
		System.out.println("no arg constructor called ");
	}

	Employee(int eid, String ename, double esal) {
		System.out.println("Parameterized constructor called ");
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Employee emp1 = new Employee();
		emp1.eid = 7;
		emp1.ename = "MSD";
		emp1.esal = 100000.00;
		emp1.empInfo();

		Employee emp2 = new Employee(18, "Virat", 500000.00);
		emp2.empInfo();

		Employee emp3 = new Employee(45, "Rohit", 600000.00);
		emp3.empInfo();

		System.out.println("main method ended ");

	}

	void empInfo() {
		System.out.println("Employee ID : " + eid);
		System.out.println("Employee Name : " + ename);
		System.out.println("Employee Salary : " + esal);
		System.out.println("*********************************");
	}

}
