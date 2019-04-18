package com.abhim.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
	
	private FortuneService fortuneService = null;
	
	@Value("${demo.team}")
	private String  teamName;
	
	@Value("${demo.email}")
	private String teamEmail;
	
	@Autowired
	public FootballCoach(@Qualifier("randomFortuneService")FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Practice passing for 30 mins";
	}

	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

	public String getTeamDetails() {
		return teamName+" "+teamEmail;
	}

}
