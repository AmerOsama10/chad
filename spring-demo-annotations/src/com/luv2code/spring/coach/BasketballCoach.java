package com.luv2code.spring.coach;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.luv2code.spring.message.MessageService;

//post construct - pre destroy
//field injuction
//you need to add jar annotation to your libraries to work cause after java 9 its not supported

@Component
public class BasketballCoach implements Coach {

	public BasketballCoach() {
		System.err.println("BasketballCoach - no args constructor ");

	}
	
	@Autowired
	@Qualifier("randomMessageService")
	private MessageService message;
	
	@PostConstruct
	public void doMyStartupStuff() {
		System.err.println("------ Bascketball startup -I am a startup stuff ----------  ");
	}
	
	
	
	@PreDestroy
	public void doMyCleanupStuff() {
		System.err.println("------ Bascketball clean -I am a clean stuff ----------  ");
	}

	@Override
	public String getDailyWorkOut() {
		return "This is basketball";
	}

	@Override
	public String getMessage() {
		return message.getMessage();
	}

}
