package com.luv2code.spring.coach;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//send values 
//properties


@Component
public class SwimCoach implements Coach {
	@Value("amer")
	private String name;
	
	@Value("amer@gmail.com")
	private String email;

	public SwimCoach() {
		System.err.println("SwimCoach - no args constructor ");

	}

	public void Print() {
		System.out.println("Name is "+name +"\nEmail i "+email);

	}
	
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
