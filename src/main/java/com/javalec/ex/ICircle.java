package com.javalec.ex;

public class ICircle implements IShape{ //인터페이스 사용하면 다형성사용하겠다는 것
	
	private double radius;
	
	public ICircle() {};
			
	public ICircle(double radius) {
		super();
		this.radius = radius;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	@Override
    public double getArea() {
	    
		return radius* Math.PI;
	}    
	


}
