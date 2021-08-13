package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	//dependency variable (private)
	private FortuneService fortuneService;
	public TrackCoach() {
	}
	//constructor injection
	public TrackCoach(FortuneService service)
	{
		fortuneService = service;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Track exercises";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "ayoo have fun :) " +fortuneService.getFortune();
	}
	
	//initialization bean method
	public void doStarterStuff()
	{
		System.out.println("starting bean life brrrrrrrrrrrrrrr...");
	}
	
	//destruction bean method
	public void doClosingStuff()
	{
		System.out.println("destroying bean brrrrrrrrrrrrrrr...");
	}
}
