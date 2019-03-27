package com.test.Spring_Demo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneServie;
	
	
	
	public BaseballCoach(FortuneService fortuneServie) {
		super();
		this.fortuneServie = fortuneServie;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Spend 30 minutes on batting practice";
	}
	
	@Override
	public String getFortune()
	{
		return "Today Is Your Lucky Day";
	}
	
	@Override
	public String getDailyFortune()
	{
		return fortuneServie.getFortune();
	}

}








