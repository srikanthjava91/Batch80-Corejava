package com.languagefundamentals.constructor;

//Super class /Parent /Base
class Product {

	String model;
	double price;
	String brand;
	String color;

	public Product() {
		System.out.println("no-arg constructor called from Product ");
	}

	Product(String model, String brand) {
		System.out.println("two arg parameterized constructor called from Product");
		this.model = model;
		this.brand = brand;
	}

	public static void main(String[] args) {
		System.out.println("main method started from Product");
	}

}

//Sub-calss / Child /Derived 
//Mobile IS-A  Product
//In Java, To achieve Inheritance, we use extends keyword.
//Inheritance means, Getting the Parent class data members into child class to provide code re-usability.
//And to avoid code duplication.
public class Mobile extends Product {
	String model = "Unknwon";

//	Whenever child extends Parent class 
//	Automatically, the child class constructor calls the Super class constructor implicitly
//	if we are not calling..
	Mobile() {
		super();
		System.out.println("no-arg constructor called from Mobile ");
	}

	// By default every constructor calls super() if we are not calling any
	// constructor
	Mobile(String model, String brand, double price, String color) {
		System.out.println("4-arg constructor called from Mobile ");
		super.model = model;
		super.brand = brand;
		super.color = color;
		super.price = price;
	}

	Mobile(String model, String brand) {
		super(model, brand);
		System.out.println("2-arg constructor called from Mobile ");
	}

	public static void main(String[] args) {
		System.out.println("main method started from Mobile");

		Mobile m = new Mobile();
		m.mobileInfo();

		Mobile m1 = new Mobile("iPhone 17 Pro", "IPhone", 130000.00, "Blue");
		m1.mobileInfo();

		Mobile m2 = new Mobile("Pixel 10 Pro", "Google");
		m2.mobileInfo();
		
		//Cannot use this in a static context
//		System.out.println(this.model);

	}

	void mobileInfo() {
		System.out.println("Model of the Mobile  : " + super.model);
		System.out.println("Brand of the Mobile : " + brand);
		System.out.println("Price of the Mobile : " + price);
		System.out.println("Color of the Mobile : " + color);
		System.out.println("************************************");
	}

}
