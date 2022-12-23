package com.luv2code.spring.app;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.spring.coach.SwimCoach;

// send values 
// properties

public class PropertiesSpringApp {
	public static void main(String[]args) {
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/com/luv2code/spring/metadata/applicationContext.xml");
		// get the bean from spring container
		SwimCoach coach = context.getBean("swimCoach",SwimCoach.class);
		//call a method on the bean
		System.out.println(coach.getDailyWorkOut());
		System.out.println(coach.getMessage());
		//coach.Print();

		//close the context
		context.close();
	}
}
