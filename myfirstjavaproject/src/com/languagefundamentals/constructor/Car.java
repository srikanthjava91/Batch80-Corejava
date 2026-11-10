package com.languagefundamentals.constructor;

public class Car {

	String model;
	String brand;
	double price;
	String color;

	Car() {
		System.out.println("no arg constructor called ");
		model = "unknown";
		brand = "unknown";
		price = 100000.00;
		color = "unknown";
	}

	public Car(String model, String brand, double price, String color) {
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	public Car(String model, String brand) {
		this.model = model;
		this.brand = brand;
	}

	public Car(String model, String brand, double price) {
		this.model = model;
		this.brand = brand;
		this.price = price;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Car c = new Car();
		c.carInfo();

		Car c1 = new Car("Sonet", "KIA", 1400000.00, "RED");
		c1.carInfo();

		Car c2 = new Car("Nexon", "Tata");
		c2.carInfo();

		Car c3 = new Car("I20", "Huandai", 100000.00);
		c3.carInfo();

		System.out.println("main method ended ");
	}

	void carInfo() {

		System.out.println("Model of the Car is : " + model);
		System.out.println("Barnd of the Car is : " + brand);
		System.out.println("Price of the Car is : " + price);
		System.out.println("Color of the Car is : " + color);
		System.out.println("*******************************");
	}

}
