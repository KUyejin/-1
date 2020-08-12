package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
//GenericXmlApplicationContext은 

public class AreaMain {

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
		
		String configLocation = "classpath:appAreaCTX.xml"; 
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation); 
		                                   //GenericXmlApplicationContext은 IOC컨테어너(스프링)이다
     
		Area area = ctx.getBean("area1", Area.class);
		area.getArea();                         
		
		Area area2 =ctx.getBean("area2", Area.class);
		area2.getArea();
		
		Area area3 =ctx.getBean("area3", Area.class);
		System.out.println(area3.getArea(20,20));
		
		Area area4 =ctx.getBean("area4", Area.class);
		System.out.println(area4.getArea(20,20));
		
		ctx.close();
		
	}
	
}
