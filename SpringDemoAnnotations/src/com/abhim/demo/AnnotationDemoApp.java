package com.abhim.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//initialize context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Get the bean from container
		Coach theCoach = context.getBean("thatSillyCoach",Coach.class);
		Coach newCoach = context.getBean("footballCoach",Coach.class);
		Coach newCoach2 = context.getBean("trackCoach",Coach.class);
		
		//use the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println("-----------------------------");
		System.out.println(newCoach.getDailyWorkout());
		System.out.println(newCoach.getDailyFortune());
		System.out.println(newCoach.getTeamDetails());
		System.out.println("-----------------------------");
		System.out.println(newCoach2.getDailyWorkout());
		System.out.println(newCoach2.getDailyFortune());
		
		
		//Close context
		context.close();
	}

}
