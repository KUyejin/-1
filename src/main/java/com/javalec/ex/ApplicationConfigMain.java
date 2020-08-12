package com.javalec.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
//GenericXmlApplicationContext은 

public class ApplicationConfigMain {

	public static void main(String[] args) {
		
		String configLocation1 = "classpath:stuCTX.xml"; 
		String configLocation2 = "classpath:stu2CTX.xml"; 
	
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class); 
		                                   //AnnotationConfigApplicationContext
		                                   //자바파일(클래스파일)읽어주는  IOC컨테이너
     
		Student2 student1 = ctx.getBean("student1",Student2.class); 
		//"student1"는 ApplicationConfig class에 있는 함수명이다
		System.out.println(student1.getName());
		System.out.println(student1.getHobbys());
		
		System.out.println("==============================");
		
		Student2 student2 = ctx.getBean("student2",Student2.class);
		//"student2"는 ApplicationConfig class에 있는 함수명이다
		System.out.println(student2.getName());
		System.out.println(student2.getAge());
		System.out.println(student2.getHobbys());
		System.out.println(student2.getHeight());
		System.out.println(student2.getWeight());
		
		
		ctx.close();
		
	}
	
}
