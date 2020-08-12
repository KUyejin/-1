package com.javalec.ex;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;


public class AdminConnectionMain {

	public static void main(String[] args) {
		
		
		//3종세트
		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext(); //ctx 파일 생성
		//폴리몰피즘 적용 -ConfigurableApplicationContext에 getEnvironment가 있다.
		//그렇기 때문에 AbstractApplicationContext 안써도 된다
		//메모리에 getEnvironment가지고 있다.
		ConfigurableEnvironment env = ctx.getEnvironment(); //environment객체을 env담는 것
		MutablePropertySources propertySources = env.getPropertySources(); //env의 소스들을 propertysource로 가져옴
		//Environment안에 propertySources가지고 있다
		
		try {
			propertySources.addLast(new ResourcePropertySource("classpath:admin.properties"));
			
			System.out.println( env.getProperty("admin.id") );
			System.out.println( env.getProperty("admin.pw") );
		} catch (IOException e) {}
		
		GenericXmlApplicationContext gCtx = (GenericXmlApplicationContext)ctx;
		//형변환 다운그레이드
		//Environment에 관한 내용이 담긴 ctx를 형변환하여 gctx 객체에 담는다
		gCtx.load("AdminConnectionCTX.xml");
		gCtx.refresh(); //초기화
		
		AdminConnection adminConnection = gCtx.getBean("adminConnection", AdminConnection.class);
		System.out.println("admin ID : " + adminConnection.getAdminId());
		System.out.println("amdin PW : " + adminConnection.getAdminPw());
		//xml파일에 set으로 셋팅을 안해줬음에도 결과값이 나왔다 -> 스프링이 알아서 세팅해줌
		
		gCtx.close();
		ctx.close();
		
	}
	
}
