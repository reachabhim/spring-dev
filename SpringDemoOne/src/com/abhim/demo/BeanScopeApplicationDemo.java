package com.abhim.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApplicationDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext appcontext = new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
		
		FootballCoach coach3 = appcontext.getBean("myNewCoach",FootballCoach.class);
		FootballCoach coach4 = appcontext.getBean("myNewCoach",FootballCoach.class);
		
		
		System.out.println("Coach1: "+coach3);
		System.out.println("Coach2: "+coach4);
		System.out.println("Equals? "+(coach3 == coach4));
		
		appcontext.close();

	}

}
