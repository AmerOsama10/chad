package com.luv2code.spring.coach;

import com.luv2code.spring.message.MessageService;

public class CricketCoach implements Coach {

	private String email;
	private String team;
	private MessageService message;

	public CricketCoach() {
		System.err.println("CricketCoach - no args constructor");
	}

	public CricketCoach(MessageService message) {
		System.err.println("CricketCoach -  with MessageService parameter constructor");

		this.message = message;
	}
	
	public void print() {
		System.out.println(" my email = "+ email +"\n my team = "+ team+"\n message is "+message.getHappyMessage() );
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes today";
	}

	@Override
	public String getDailyMessage() {
		return message.getSadMessage();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.err.println("CricketCoach -  Email inside setter method");

		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.err.println("CricketCoach -  Team inside setter method");

		this.team = team;
	}

	public MessageService getMessage() {
		return message;
	}

	public void setMessage(MessageService message) {
		System.err.println("CricketCoach -  Message inside setter method");
		this.message = message;
	}

}
