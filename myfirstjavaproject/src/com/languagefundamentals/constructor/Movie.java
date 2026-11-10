package com.languagefundamentals.constructor;

public class Movie {

	String director;
	String hero;
	String heroine;
	double budget;
	String name;

	public Movie(String director, String hero, String heroine, double budget, String name) {
		super();
		this.director = director;
		this.hero = hero;
		this.heroine = heroine;
		this.budget = budget;
		this.name = name;
	}

	Movie(Movie m) {
		this.director = m.director;
		this.hero = m.hero;
		this.heroine = m.heroine;
		this.budget = m.budget;
		this.name = m.name;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Movie m = new Movie("S S Rajamouli", "Mahesh Babu", "Priyanka", 500000000.00, "Varanasi");
		m.movieInfo();

//		Copying one object data into another object with constructor will consider as Copy Constructor 
//		will provide code re-usability and avoiding code duplication.
		Movie m1 = new Movie(m);
		m1.movieInfo();
	}

	void movieInfo() {
		System.out.println("Director of the MOvie : " + director);
		System.out.println("Hero of the Movie : " + hero);
		System.out.println("Heroine of the movie : " + heroine);
		System.out.println("Budget of the Budget : " + budget);
		System.out.println("Name of the Movie : " + name);
		System.out.println("******************************");
	}

}
