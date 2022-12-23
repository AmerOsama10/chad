package com.luv2code.spring.coach;

import org.springframework.beans.factory.DisposableBean;

import com.luv2code.spring.message.MessageService;

public class TrackCoach implements Coach ,DisposableBean {

	
	// define a private field for the dependency
		private MessageService messageService;
		
		
		// define a constructor for dependency injection
		
		public TrackCoach( ) {
			System.err.println("TrackCoach - no args constructor");
		}
		
		public TrackCoach(MessageService theMessageService ) {
			System.err.println("TrackCoach - with MessageService parameter args constructor");
			messageService = theMessageService;
		}
		
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyMessage() {
		// TODO Auto-generated method stub
		return "Just do it + "+messageService.getHappyMessage();
	}
	
	// add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach : inside method doMyStartupStuff ");
	}
	
	// add an destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach : inside method doMyCleanupStuff ");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("TrackCoach : inside method destroy ");
		
	}
	


}
