package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration  //XML을 자바로 설정하는 것
                //XML을 설정하는 것보다 좋은 점은? 디버깅 가능
@ImportResource("classpath:applicationCTX.xml") //해당 xml을 끌고 오는 것
public class ApplicationConfig {
	
	@Bean
	public Student2 student1() {
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("돈벌기");
		hobbys.add("쑈");
		Student2 student = new Student2("홍원의", 20, hobbys);
		student.setHeight(180);
		student.setWeight(80);
		
		return student;
	}
	
	@Bean
	public Student2 student2() {
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("독서");
		hobbys.add("음악감상");
		Student2 student = new Student2("이천웅", 20, hobbys);
		student.setHeight(170);
		student.setWeight(55);
		
		return student;
	}

}
