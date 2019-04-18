package com.abhim.demo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	FortuneService fortuneService = null;
	
	@Value("${swim.team}")
	String team;
	
	@Value("${swim.email}")
	String email;
	
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Swimm for 10 mins";
	}

	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

	public String getTeamDetails() {
		return this.team+" : "+this.email;
	}

}
