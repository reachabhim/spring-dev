package com.abhim.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLiteralValueInjDemo {
	
	public static void main(String[] args) {
		//initialize the context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//create the object
		CricketCoach cricketCoach = context.getBean(CricketCoach.class, "myCricketCoach");
		
		//use the object
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyFortune());
		
		System.out.println(cricketCoach.getEmailAddress());
		System.out.println(cricketCoach.getTeamName());
		//close the context
		context.close();
	}
}
