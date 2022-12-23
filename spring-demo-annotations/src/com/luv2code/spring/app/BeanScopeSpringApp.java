package com.luv2code.spring.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.spring.coach.Coach;
// scope of the bean [ singleton - prototype]

public class BeanScopeSpringApp {
	public static void main(String[]args) {
		// load the spring configuration file	
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/com/luv2code/spring/metadata/applicationContext.xml");
				
				// retrieve bean from spring container
				Coach theCoach1 =  context.getBean("tennisCoach",Coach.class);
				Coach theCoach2 =  context.getBean("tennisCoach",Coach.class);

				// check if they are the same
				boolean result= (theCoach1 == theCoach2);
				
				//print out the results
				System.out.println("\nPointing to the same object = " + result);
				System.out.println("\nMemory location for the coach = " + theCoach1);
				System.out.println("\nMemory location for the coach = " + theCoach2);

				//close the context
				context.close();
			}
		}
