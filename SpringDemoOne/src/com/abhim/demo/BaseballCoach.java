package com.abhim.demo;

public class BaseballCoach implements Coach{
	
	//Define fortune service dependency variable
	private FortuneService fortuneService =null;
	
	

	//define constructor for dependency injection
	public BaseballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	
	
	public BaseballCoach() {
		System.out.println("BaseballCoach: Inside no-arg constructor");
	}
	
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		//use fortune service to get fortune
		return "Just Do it: "+this.fortuneService.getFortune(); 
	}

	@Override
	public void setFortuneService(FortuneService fortuneService) {
		// TODO Auto-generated method stub
		
	}
	
	

}
