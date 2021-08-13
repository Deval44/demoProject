package com.luv2code.springdemo;

public class BaseballCoach implements Coach{

	private FortuneService fortuneService;
	public BaseballCoach(FortuneService service)
	{
		fortuneService = service;
	}
	
	@Override
	public String getDailyWorkout()
	{
		return "baseball exercises";
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
