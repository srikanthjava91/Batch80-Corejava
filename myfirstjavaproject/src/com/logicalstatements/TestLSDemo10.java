package com.logicalstatements;

import java.util.Scanner;

//Q) Write POC Restaurant Billing System using nested Switch ..? 
public class TestLSDemo10 {

	public static void main(String[] args) {
		System.out.println("Welcome to Vcube Restaurant !!");
		Scanner sc = new Scanner(System.in);
		String yn = "";
		double vegCost = 0;
		double nvcost = 0;

		do {
			System.out.println("Enter the Category :");
			String catg = sc.next();
//			catg = veg or non-veg or desserts or starters or drinks 
			switch (catg) {

			case "veg" -> {

				String vyn = "";

				do {
					System.out.println("Enter the item : ");
					String item = sc.next();

					switch (item) {

					case "vb" -> {
						System.out.println("Veg Biriyani - 500/-");
						double vbCost = 500;
						vegCost = vegCost + vbCost;
					}
					case "pb" -> {
						System.out.println("Paneer Biriyani - 600/-");
						double pbCost = 600;
						vegCost = vegCost + pbCost;
					}
					case "pbm" -> {
						System.out.println("Paneer Butter Masala - 250/-");
						double pbmCost = 250;
						vegCost = vegCost + pbmCost;
					}
					case "mb" -> {
						System.out.println("Mushroom Biryani - 280/-");
						double mbCost = 280;
						vegCost = vegCost + mbCost;
					}
					case "kp" -> {
						System.out.println("Kaju Pulao - 300/-");
						double kpCost = 300;
						vegCost = vegCost + kpCost;
					}
					case "vfr" -> {
						System.out.println("Veg Fried Rice - 200/-");
						double vfrCost = 200;
						vegCost = vegCost + vfrCost;
					}
					default -> System.out.println("This item not available !!");

					}

					System.out.println("Do you want to continue with the Veg Itesm ..? Click Y for Yes !! N for No ");
					vyn = sc.next();

				} while (vyn.equalsIgnoreCase("y"));

				System.out.println("Total Veg Cost is : " + vegCost);
			}

			case "non-veg" -> {

				String nvyn = "";

				do {
					System.out.println("Enter the item : ");
					String item = sc.next();

					switch (item) {

					case "cb" -> {
						System.out.println("Chicken Biriyani  - 650/-");
						double cbCost = 650;
						nvcost = nvcost + cbCost;
					}
					case "mb" -> {
						System.out.println("Mutton Biriyani - 750/-");
						double mbCost = 750;
						nvcost = nvcost + mbCost;
					}
					case "cfr" -> {
						System.out.println("Chicken Fried Rice - 350/-");
						double cfrCost = 350;
						nvcost = nvcost + cfrCost;
					}
					case "c65" -> {
						System.out.println("Chicken 65 - 400/-");
						double c65Cost = 400;
						nvcost = nvcost + c65Cost;
					}
					case "bc" -> {
						System.out.println("Butter Chicken - 450/-");
						double bcCost = 450;
						nvcost = nvcost + bcCost;
					}
					default -> System.out.println("ENter Item is not available :  ");

					}

					System.out.println("Do you want to continue with NV Items ..? Click Y for yes N for N");
					nvyn = sc.next();

				} while (nvyn.equalsIgnoreCase("y"));

				System.out.println("Total NV Cost is : " + nvcost);
			}

			default -> System.out.println("Enter category is not availbale ");
			}
			System.out.println("Do you want to continue with categories click Y for Yes N for N..?");
			yn = sc.next();

		} while (yn.equalsIgnoreCase("y"));

		System.out.println("Total Cost is : " + (vegCost + nvcost));
	}
}
