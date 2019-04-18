package com.abhim.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
	@Autowired
	private @Qualifier("randomFortuneService")FortuneService fortuneService =null;

	public String getDailyWorkout() {
		return "Run hard 5k";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getTeamDetails() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*
	 * @Autowired public void
	 * setFortuneService(@Qualifier("randomFortuneService")FortuneService
	 * fortuneService) { this.fortuneService = fortuneService; }
	 */
//	@Autowired
//	public void doSomeCrazyStuff(@Qualifier("randomFortuneService")FortuneService fortuneService) {
//		System.out.println("Inside doSomeCrazyStuff");
//		this.fortuneService = fortuneService;
//	}
}
