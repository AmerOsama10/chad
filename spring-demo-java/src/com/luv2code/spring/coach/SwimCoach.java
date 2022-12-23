package com.luv2code.spring.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.luv2code.spring.message.MessageService;


public class SwimCoach implements Coach {
	@Value("${foo.name}")
	private String name;
	@Value("${foo.email}")
	private String email;

	private MessageService message;

	public SwimCoach() {
		System.err.println("SwimCoach - no args constructor ");

	}

	public SwimCoach(MessageService message) {
		System.err.println("SwimCoach - with MessageService args constructor ");
		this.message=message;

	}
	
	
	@Override
	public String getDailyWorkOut() {
		return "This is swim coach";
	}

	@Override
	public String getMessage() {
		return message.getMessage();
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}


}
