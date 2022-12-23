package com.luv2code.spring.app;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.spring.coach.Coach;


//field injection
//Qualifier when conflict

public class FieldSpringApp {
	public static void main(String[]args) {
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/com/luv2code/spring/metadata/applicationContext.xml");
		// get the bean from spring container
		Coach coach = context.getBean("basketballCoach",Coach.class);
		//call a method on the bean
		System.out.println(coach.getDailyWorkOut());
		System.out.println(coach.getMessage());

		//close the context
		context.close();
	}
}
