package com.languagefundamentals.methods;

import java.util.Scanner;

//With return_type & with Parameters
//WAP to find Area's of Triangle, Square, Rectangle, & Circle.
//Area of Triangle : 0.5 * Base * Height 
//Area of Square  : Side * side 
//Area of Rectangle : Length * Breadth
//Area of Circle : PI * r * r 

public class AreasInfo {

	static double findAreaOfCircle(double r) {
		return Math.PI * r * r;
	}

	static double getAreaOfRectangle(double length, double breadth) {
		return length * breadth;
	}

	static double getAreaOfSquare(double side) {
		return side * side;
	}

	static double getAreaOfTriangle(double base, double height) {
		return 0.5 * base * height;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Base : ");
		double b = sc.nextDouble();

		System.out.println("Enter a Height : ");
		double h = sc.nextDouble();

		double arTri = getAreaOfTriangle(b, h);
		System.out.println("Area of Triangle is : " + arTri);

		System.out.println("************************");
		System.out.println("Enter a Side : ");
		double side = sc.nextDouble();
		double arSq = getAreaOfSquare(side);
		System.out.println("Area of Square is : " + arSq);

		System.out.println("************************");
		System.out.println("Enter a Length : ");
		double l = sc.nextDouble();
		System.out.println("Enter a Breadth : ");
		double br = sc.nextDouble();
		double arRec = getAreaOfRectangle(l, br);
		System.out.println("Area of Recatngle : " + arRec);

		System.out.println("************************");
		System.out.println("Enter Radius : ");
		double r = sc.nextDouble();
		double arCir = findAreaOfCircle(r);
		System.out.println("Area of Circle is : " + arCir);

	}

}
