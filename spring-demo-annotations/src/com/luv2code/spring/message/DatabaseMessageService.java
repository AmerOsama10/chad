package com.luv2code.spring.message;

import org.springframework.stereotype.Component;

@Component

public class DatabaseMessageService implements MessageService {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Today is a database day";
	}

}
