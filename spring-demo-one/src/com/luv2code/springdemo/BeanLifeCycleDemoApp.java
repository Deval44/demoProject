package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {

		//create container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//retrieve bean
		Coach theCoach = context.getBean("myCoach", Coach.class);
		//use bean methods
		System.out.println(theCoach.getDailyWorkout());
		
		//close container
		context.close();
	}

}
