package com.luv2code.spring.app;

import com.luv2code.spring.coach.Coach;
import com.luv2code.spring.coach.TrackCoach;

public class NoSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create the object
		Coach coach = new TrackCoach();
		
		// use the object
		System.out.println(coach.getDailyWorkout());
		
	}

}
