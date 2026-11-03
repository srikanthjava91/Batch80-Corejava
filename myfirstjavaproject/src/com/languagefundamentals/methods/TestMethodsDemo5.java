package com.languagefundamentals.methods;

class Student {
	int sid;
	String sname;
	int age;
}

public class TestMethodsDemo5 {

	// Factory methods
	Student getStudent() {
		Student s1 = new Student();
		s1.sid = 18;
		s1.sname = "Virat";
		s1.age = 38;
		return s1;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		TestMethodsDemo5 t1 = new TestMethodsDemo5();
		
		Student s = t1.getStudent();
		System.out.println(s.sid);
		System.out.println(s.sname);
		System.out.println(s.age);
		
		t1.sendStudentData(s);
		
		System.out.println("main method ended ");

	}

	 void sendStudentData(Student st) {
		 System.out.println("Student Data received ");
		System.out.println(st.sid);
		System.out.println(st.sname);
		System.out.println(st.age);
	}
	
}


