package com.abhim.demo;

public class TrackCoach implements Coach {	

	//Define fortune service dependency variable
	private FortuneService fortuneService =null;
	
	public TrackCoach() {
		System.out.println("TrackCoach: Inside no-arg constructor");
	}
	
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k!";
	}

	@Override
	public String getDailyFortune() {
		//use fortune service to get fortune
		return this.fortuneService.getFortune(); 
	}

}
