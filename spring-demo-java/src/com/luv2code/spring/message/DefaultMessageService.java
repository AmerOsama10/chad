package com.luv2code.spring.message;

import org.springframework.stereotype.Component;

@Component
public class DefaultMessageService implements MessageService{

	@Override
	public String getMessage() {
		return "Today is a happy day";
	}

}
