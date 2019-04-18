package com.abhim.demo;

public class CricketCoach implements Coach {
	
	//Define fortune service dependency variable
	private FortuneService fortuneService =null;
	
	//email address
	private String emailAddress;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	//team name
	private String teamName;
	
	public CricketCoach() {
		System.out.println("CricketCoach: Inside no-arg constructor");
	}

	//define constructor for dependency injection
	public CricketCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Do catching practice for 1 hour!";
	}

	@Override
	public String getDailyFortune() {
		//use fortune service to get fortune
		return this.fortuneService.getFortune(); 
	}

	@Override
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		
	}

}
