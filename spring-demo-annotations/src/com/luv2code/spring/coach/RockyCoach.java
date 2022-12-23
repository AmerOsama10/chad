
package com.luv2code.spring.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.luv2code.spring.message.MessageService;


//setter injection

@Component
public class RockyCoach implements Coach {
	private MessageService message;
	
	public RockyCoach() {
		System.err.println("RockyCoach - no args constructor ");

	}

	@Autowired
	@Qualifier("defaultMessageService")
	public void setMessageService(MessageService message) {
		System.err.println("RockyCoach - Message setter");
		this.message=message;
	}

	@Override
	public String getDailyWorkOut() {
		return "Practice your rocky well";
	}

	@Override
	public String getMessage() {
		
		return message.getMessage();
	}
	
	

}
