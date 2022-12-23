package com.luv2code.spring.metadata;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.luv2code.spring.coach.Coach;
import com.luv2code.spring.coach.SwimCoach;
import com.luv2code.spring.message.MessageService;
import com.luv2code.spring.message.RandomMessageService;

@Configuration
@PropertySource("classpath:/com/luv2code/spring/metadata/sports.properties")
public class sportConfig {
	
	//define bean for qualifiation
	@Bean
	public MessageService randomMessageService() {
		return new RandomMessageService();
	}
	
	
	//define bean and inject dependency
	@Bean
	public Coach swimCoach() {
		
		return new SwimCoach(randomMessageService());
	}
	


	
	
}
