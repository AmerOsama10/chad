package com.luv2code.spring.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.spring.coach.Coach;

public class beanLifeCycleSpringApp {
	public static void main(String[] args) {
		
		// load the spring configuration file	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/com/luv2code/spring/xml/beanLifeCycle-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach =  context.getBean("trackCoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		//close the context
		context.close();
	}
}
