package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
//GenericXmlApplicationContext은 

public class StudentMain {

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
		
		String configLocation = "classpath:studentCTX.xml"; //studentInfo꺼내 오려고	
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation); 
		                                   //GenericXmlApplicationContext은 IOC컨테어너(스프링)이다
     
		StudentInfo studentInfo= ctx.getBean("studentInfo", StudentInfo.class);
		                                      //"studentInfo"는 변수명
		studentInfo.getStudentInfo();
		
		
		Student student2 = ctx.getBean("student2",Student.class);
		studentInfo.setStudent(student2);
		studentInfo.getStudentInfo();
		
		
		ctx.close();
		
	}
	
}
