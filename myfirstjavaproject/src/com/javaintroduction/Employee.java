package com.javaintroduction;

public class Employee {

	static String orgName = "Vcube";
	static int orgId = 555;

	int eid = 100;
	String ename = "unknown";

	public static void main(String[] args) {
		System.out.println("main method started ");

		// For local variables, JVM will not provide any default values.
//		SO, Whenever we try to access without initializing then will get CE like below.
//		CE : The local variable x may not have been initialized
//		local variables are storing inside the stack Area.

//		static int x;//Illegal modifier for parameter x; only final is permitted
		int x;
		x = 10;
		System.out.println(x);

		String orgName = "VSS";
		int orgId = 666;

		// static variables, we can access by using class name and also we can call
		// directly.
		Employee emp1 = new Employee();
		System.out.println(Employee.orgId);
		System.out.println(Employee.orgName);

		System.out.println(orgName);
		System.out.println(orgId);

//		Q) Can I call static data by using Object Reference variables.? YES
//		The static field Employee.orgId should be accessed in a static way
		System.out.println(emp1.orgId);
		System.out.println(emp1.orgName);

		emp1.eid = 101;
		emp1.ename = "Phani";

		System.out.println(emp1.eid);
		System.out.println(emp1.ename);
		System.out.println("main method ended ");
	}

}
