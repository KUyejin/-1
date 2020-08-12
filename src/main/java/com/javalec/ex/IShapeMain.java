package com.javalec.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IShapeMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(IShapeConfig.class);
		
		ITriangle triangle = ctx.getBean("triangle",ITriangle.class);
		System.out.println(triangle.getArea());
	
		IRectangle rectangle = ctx.getBean("rectangle",IRectangle.class);
		System.out.println(rectangle.getArea());
		
		ICircle circle= ctx.getBean("circle",ICircle.class);
		System.out.println(circle.getArea());

	}

}
