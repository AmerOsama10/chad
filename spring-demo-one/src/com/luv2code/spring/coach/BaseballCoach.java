package com.luv2code.spring.coach;

import com.luv2code.spring.message.MessageService;

public class BaseballCoach implements Coach {

	// 1- define a private field for the dependency
	private MessageService message;

	// 2- define a default constructor
	public BaseballCoach() {
		System.err.println("BaseballCoach - no args constructor");
	}

	// 3- define a constructor for dependency injection
	public BaseballCoach(MessageService theMessage) {
		System.err.println("BaseballCoach - with MessageService parameter args constructor");
		message = theMessage;
	}

	@Override
	public String getDailyWorkout() {
		return "ok thats baseball coach";
	}

	@Override
	public String getDailyMessage() {
		// 4- use my message service to get a message
		return message.getHappyMessage();
	}

}
