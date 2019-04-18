package com.abhim.demo;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String fortunes[]= {"The early bird gets the worm, but the second mouse gets the cheese.",
			"Be on the alert to recognize your prime at whatever time of your life it may occur",
			"Your road to glory will be rocky, but fulfilling.",
			"Courage is not simply one of the virtues, but the form of every virtue at the testing point",
			"Patience is your alley at the moment. Don’t worry!"};

	@Override
	public String getFortune() {
		int randomNum = ThreadLocalRandom.current().nextInt(0, fortunes.length);
		return fortunes[randomNum];
	}

}
