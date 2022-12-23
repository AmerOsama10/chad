package com.luv2code.spring.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.spring.coach.CricketCoach;

public class SetterSpringApp {

	public static void main(String[] args) {
		
		//load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/com/luv2code/spring/xml/applicationContext.xml");
		
		//retrieve bean from spring container
		CricketCoach theCoach =  context.getBean("cricketCoach",CricketCoach.class);

		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyMessage());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());

		//close context
		context.close(); 
	}

}
