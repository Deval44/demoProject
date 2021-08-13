package com.luv2code.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		String[] s= {"have a nice day :)",
				"attaboy!",
				"good fortune to you <3"
		};
		int x;
		x=((int)(Math.random()*9))%3;
		
		return s[x] ;
	}

}
