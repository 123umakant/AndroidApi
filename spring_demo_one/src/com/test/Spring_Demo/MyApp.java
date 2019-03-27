package com.test.Spring_Demo;

public class MyApp {

	public static void main(String[] args) {

		// create the object
		 Coach theCoach = new BaseballCoach(null);
		
		  Coach theCoach1 = new CricketCoach();
		 		
		// use the object
		System.out.println(theCoach1.getDailyWorkout());		
		
		
		
	}

}
