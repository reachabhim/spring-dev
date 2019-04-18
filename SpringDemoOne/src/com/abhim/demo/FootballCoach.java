package com.abhim.demo;

public class FootballCoach implements Coach {

	// Define fortune service dependency variable
	private FortuneService fortuneService = null;

	
	public FootballCoach() {
		
	}

	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// use fortune service to get fortune
		return this.fortuneService.getFortune();
	}

	@Override
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		
	}
	
	public void doInitStuff() {
		System.out.println("Inside init");
	}
	
	public void doDestroyStuff() {
		System.out.println("Inside destroy");
	}

}
