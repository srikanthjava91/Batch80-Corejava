package com.arrays;

//WAP to Represent String values using Arrays..? 
public class TestArrDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		String[] names;
		names = new String[5];// 0 1 2 3 4 --> null null null null null

		names[0] = "Pavan";
		names[1] = "Kalyan";
		names[2] = "Seshu";
		names[3] = "Teja";
		names[4] = "Srikanth";
		names[4] = "Srinivas";

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

//		for (String name : names) {
//			System.out.println(name);
//		}
	}
}
