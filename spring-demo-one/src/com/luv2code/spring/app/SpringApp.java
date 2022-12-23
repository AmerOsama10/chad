package com.luv2code.spring.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.spring.coach.Coach;

public class SpringApp {

	public static void main(String[] args) {

		// load the spring configuration file	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/com/luv2code/spring/xml/applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = (Coach) context.getBean("baseballCoach");

		// call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//lets call our new method for messages
		System.out.println(theCoach.getDailyMessage());



		// close the context
		context.close();
		
	}

}
