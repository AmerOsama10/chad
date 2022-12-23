package com.luv2code.spring.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.luv2code.spring.message.MessageService;

//field injection
//Qualifier when conflict

@Component
public class FootballCoach implements Coach {
	public FootballCoach() {
		System.err.println("FootballCoach - no args constructor ");

	}
	
	@Autowired
	@Qualifier("randomMessageService")
	private MessageService message;
	
	
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Its football";
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message.getMessage();
	}

}
