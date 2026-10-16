package com.javaintroduction;

//WAP to print Indian Cricket Team info 

//All static variables are storing inside the "Method Area" 
//whenever the class loads to the memory.
//All metadata info is also storing inside the Method Area like class name and its super class name.
//class Related information is storing inside the Method area.

//All instance variables are storing inside the "Heap Area"
//Whenever we created an Object.
//Object related information storing inside the Heap Area.
public class Cricketer {

	// Declaration
	// static Data
	static int countryID;
	static String countryName;

	// instance data or Non-static data
	int jerseyNumber;
	String cricketerName;

	public static void main(String[] args) {
		System.out.println("Welcome to Indian Cricket Team !!");

//		We cannot access instance data directly in static area.
//		If we want to access instance data in static area, 
//		we must need to create a Object.
//		CE : Cannot make a static reference to the non-static field jerseyNumber
//		System.out.println(jerseyNumber);
//		CE : Cannot make a static reference to the non-static field cricketerName
//		System.out.println(cricketerName);

//		Creating an Object of a class 

//		LHS consist of 
//		Class name : Cricketer &
//		Object Reference Variable : msd 

//		RHS consist of 
//		new is the keyword to create an Object with the help of Constructor calling.
//		Cricketer(); constructor calling.
//		= is a assignment operator 

		System.out.println("Creating the Object1 **********");
		Cricketer msd = new Cricketer();

//		Initialization 
		countryID = 91;
		countryName = "India";

		msd.jerseyNumber = 7;
		msd.cricketerName = "Mahendra Singh Dhoni";

//		 Accessing the Data
		System.out.println("Country ID : " + countryID);// 0
		System.out.println("Country Name : " + countryName);// null

		System.out.println("Jersey Number : " + msd.jerseyNumber);// 0 --> 7
		System.out.println("Cricketer Name : " + msd.cricketerName);// null --> Mahendra Singh Dhoni

		System.out.println("Creating the Object2 **********");
		Cricketer vk = new Cricketer();
		vk.jerseyNumber = 18;
		vk.cricketerName = "Virat Kohli";
		System.out.println("Country ID : " + countryID);
		System.out.println("Country Name : " + countryName);

		System.out.println("Jersey Number : " + vk.jerseyNumber);
		System.out.println("Cricketer Name : " + vk.cricketerName);

		System.out.println("Creating the Object3 **********");
		Cricketer hitman = new Cricketer();

		countryID = 92;
		countryName = "Bharath";

		hitman.jerseyNumber = 45;
		hitman.cricketerName = "Rohit Sharma";

		System.out.println("Country ID : " + countryID);
		System.out.println("Country Name : " + countryName);

		System.out.println("Jersey Number : " + hitman.jerseyNumber);
		System.out.println("Cricketer Name : " + hitman.cricketerName);

		System.out.println("Creating the Object4 **********");
		Cricketer jaddu = new Cricketer();

		jaddu.jerseyNumber = 8;
		jaddu.cricketerName = "Jadeja";

		System.out.println("Country ID : " + countryID);
		System.out.println("Country Name : " + countryName);
		System.out.println("Jersey Number : " + jaddu.jerseyNumber);
		System.out.println("Cricketer Name : " + jaddu.cricketerName);

	}

}
