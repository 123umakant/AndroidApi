package com.test.Spring_Demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		boolean result = (theCoach==alphaCoach);
		
		System.out.println(result);
		
		  
	}

}
