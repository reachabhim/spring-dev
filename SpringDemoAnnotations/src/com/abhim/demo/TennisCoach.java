package com.abhim.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService = null;
	
	@Autowired
	public TennisCoach(@Qualifier("happyFortuneService")FortuneService  fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley!";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

	@Override
	public String getTeamDetails() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
