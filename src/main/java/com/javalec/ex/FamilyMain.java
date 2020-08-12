package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
//GenericXmlApplicationContext은 

public class FamilyMain {

	public static void main(String[] args) {

		String configLocation = "classpath:FamilyCTX.xml"; 
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation); 
        //GenericXmlApplicationContext은 IOC컨테어너(스프링)이다
		
		Family family = ctx.getBean("family", Family.class);
		
		System.out.println(family.getPapaName());
		System.out.println(family.getMamiName());
		System.out.println(family.getSisterName());
		System.out.println(family.getBrotherName());
	 
		
		                        
		
		
		
		ctx.close();
		
	}
	
}
