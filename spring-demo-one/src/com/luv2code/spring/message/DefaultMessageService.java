package com.luv2code.spring.message;

public class DefaultMessageService implements MessageService {

	
	public DefaultMessageService() {
		System.err.println("DefaultMessageService - no args constructor");

	}

	@Override
	public String getHappyMessage() {
		return "Today is your happy day! enjoy";
	}

	@Override
	public String getLuckyMessage() {
		return "Today is your lucky day! woow";
	}

	@Override
	public String getSadMessage() {
		return "Today is your sad day! sorry";
	}

}
