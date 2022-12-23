package com.luv2code.spring.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.spring.coach.Coach;
// setter injection

public class SetterSpringApp {
	public static void main(String[]args) {
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/com/luv2code/spring/metadata/applicationContext.xml");
		// get the bean from spring container
		Coach coach = context.getBean("rockyCoach",Coach.class);
		//call a method on the bean
		System.out.println(coach.getDailyWorkOut());
		System.out.println(coach.getMessage());

		//close the context
		context.close();
	}
}
