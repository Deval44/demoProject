package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String email;
	private String myTeam;
	
	public CricketCoach() {
		System.out.println("cons..");
	}

	public void setFortuneService(FortuneService service) {
		this.fortuneService = service;
	}

	public void setEmail(String newEmail) {
		this.email = newEmail;
	}
	
	public void setMyTeam(String myNewTeam) {
		this.myTeam = myNewTeam;
	}
	

	public String getEmail() {
		return email;
	}

	public String getMyTeam() {
		return myTeam;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Cricket exec..";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "ayoo cricketer :) " + fortuneService.getFortune();
	}


}
