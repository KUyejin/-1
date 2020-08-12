package com.javalec.ex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IShapeConfig {

	@Bean
	public IRectangle rectangle() {

		IRectangle r = new IRectangle(5, 5);

		return r;
	}

	
	 @Bean 
	 public ITriangle triangle() { 
		 return new ITriangle(5,5); 
     }
	 

	
	/*
	 * @Bean public ITriangle triangle() {
	 * 
	 * ITriangle t = new ITriangle(5,5);
	 * 
	 * return t; }
	 */
	 

	@Bean
	public ICircle circle() {

		ICircle c = new ICircle(5);

		return c;

	}

}
