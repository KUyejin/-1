package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
//GenericXmlApplicationContext은 

public class PersonMain {

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
		
		String configLocation = "classpath:person.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation); 
		                                   //GenericXmlApplicationContext은 IOC컨테어너(스프링)이다
     
		Person person1 = ctx.getBean("person", Person.class);
		System.out.println(person1.getName());
		System.out.println(person1.getAge());
		
		Person person2 = ctx.getBean("person", Person.class);
		person2.setName("유강남");
		person2.setAge(100);
		
		System.out.println(person1.getName());
		System.out.println(person1.getAge());
		
		System.out.println(person2.getName());
		System.out.println(person2.getAge());
		
		ctx.close();
		
	}
	
}
