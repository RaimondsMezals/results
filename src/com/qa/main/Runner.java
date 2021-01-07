package com.qa.main;

public class Runner {

	static int physics = 74;
	static int chemistry = 89;
	static int biology = 32;
	static int total;
	static double percentage;
	
	public static void results() {
		
		System.out.println("Total mark for physics is " + physics + " out of 150");
		System.out.println("Total mark for chemistry is " + chemistry + " out of 150");
		System.out.println("Total mark for biology is " + biology + " out of 150");
		
	}
	
	public static double percentageResults() {
		
		total = physics + chemistry + biology;
		
		percentage = total * 100 / 450;
		
		return percentage;
		
	}
	
	
	public static void main(String[] args) {
		
		results();
		System.out.println("The total percentage mark achieved is " + percentageResults() + "%");
		
	}

}
