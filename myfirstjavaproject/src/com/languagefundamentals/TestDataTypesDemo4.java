package com.languagefundamentals;

class Student {
	int sid = 18; 
	String sname ="VK";
	int age = 38;
	
	Address address = new Address();

}

class Address {
	String city = "Banglore";
	String state = "KA";
}

public class TestDataTypesDemo4 {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.sid);//18
		System.out.println(s1.sname);//VK
		System.out.println(s1.age);//38
		System.out.println(s1.address.city);//null dot any operation is NullPointerException
		System.out.println(s1.address.state);//
		

	}

}
