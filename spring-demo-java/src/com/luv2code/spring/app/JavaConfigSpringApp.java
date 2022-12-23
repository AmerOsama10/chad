package com.luv2code.spring.app;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.spring.coach.SwimCoach;
import com.luv2code.spring.metadata.sportConfig;


//field injection
//Qualifier when conflict

public class JavaConfigSpringApp {
	public static void main(String[]args) {
		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(sportConfig.class);
		// get the bean from spring container
		SwimCoach coach = context.getBean("swimCoach",SwimCoach.class);
		//call a method on the bean
		System.out.println(coach.getDailyWorkOut());
		System.out.println(coach.getMessage());
		System.out.println(coach.getName());
		System.out.println(coach.getEmail());


		//close the context
		context.close();
	}
}
