package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		MyCalculator myCalculator = new MyCalculator();
		myCalculator.setCalculator(new Calculator());
		
		myCalculator.setFirstNum(10);
		myCalculator.setSecondNum(2);
		
		myCalculator.add();
		myCalculator.sub();
		myCalculator.mul();
		myCalculator.div();
		*/
		
		String configLocation = "classpath:appCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation); 
		                                   //GenericXmlApplicationContext은 IOC컨테어너(스프링)이다
		MyInfo myInfo= ctx.getBean("myInfo", MyInfo.class);
		                                      //"myCalculator"는 변수명
		
		myInfo.getInfo();
		ctx.close();
		
	}
	
}
