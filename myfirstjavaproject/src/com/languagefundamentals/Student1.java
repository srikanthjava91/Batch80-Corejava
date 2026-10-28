package com.languagefundamentals;

//9 13 10 18 19 
//Illegal modifier for the class Student1; 
//only public,<default>,strictfp, abstract & final are permitted
//Floating-point expressions are always strictly evaluated from source level 17. 
//Keyword 'strictfp' is not required.
strictfp class Student1 {

	int roll_number;
	String name;
	int age;
	double fee$;

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("main method started !!");

//		System.out.println(10/0);
		Class.forName("");

		Student1 s1 = new Student1();
		System.out.println(s1.roll_number);
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.fee$);
		s1.studentInfo();
		System.out.println("main method ended !!");
	}

	void studentInfo() {
		System.out.println("student info called ");
	}

}
