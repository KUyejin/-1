package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
//GenericXmlApplicationContext은 

public class StudentMain2 {

	public static void main(String[] args) {

		String configLocation1 = "classpath:stuCTX.xml"; 
		String configLocation2 = "classpath:stu2CTX.xml"; 
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation1,configLocation2); 
		                                   //GenericXmlApplicationContext은 IOC컨테어너(스프링)이다
		
		Student2 student1 = ctx.getBean("student1",Student2.class);
		System.out.println(student1.getName());
		System.out.println(student1.getHobbys());
     
		StudentInfo2 studentInfo= ctx.getBean("studentI", StudentInfo2.class);
		Student2 student2 = studentInfo.getStudent();
		
		System.out.println(student2.getName());
		System.out.println(student2.getHobbys());
		
		Student2 student3 =ctx.getBean("student3",Student2.class); ;
		System.out.println(student3.getName());
		
		if(student1.equals(student2)) { //주소비교
			System.out.println("student1 == student2");
		}else {
			System.out.println("student1 != student2");
		}
		
		if(student1.equals(student3)) { //주소비교
			System.out.println("student1 == student3");
		}else {
			System.out.println("student1 != student3");
		}
		                                      
		
		
		
		ctx.close();
		
	}
	
}
