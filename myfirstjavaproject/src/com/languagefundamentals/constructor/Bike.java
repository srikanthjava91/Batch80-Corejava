package com.languagefundamentals.constructor;

public class Bike {

	String model;
	String brand;
	double price;
	String color;

	Bike() {
		System.out.println("no-arg constructor claled ");
		this("unknown");
	}

	public Bike(String model) {
		this(model, "unknown");
	}

	public Bike(String model, String brand) {
		this(model, brand, 500000.00);
	}

	public Bike(String model, String brand, double price) {
		this(model, brand, price, "White");
	}

	public Bike(String model, String brand, double price, String color) {
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	public static void main(String[] args) {

		Bike b = new Bike();
		b.bikeInfo();

		Bike b1 = new Bike("FZ-S");
		b1.bikeInfo();

		Bike b2 = new Bike("FZ-S", "Yamaha");
		b2.bikeInfo();
	}

	void bikeInfo() {

		System.out.println("Model of the Bike is : " + model);
		System.out.println("Barnd of the Bike is : " + brand);
		System.out.println("Price of the Bike is : " + price);
		System.out.println("Color of the Bike is : " + color);
		System.out.println("*******************************");
	}

}
