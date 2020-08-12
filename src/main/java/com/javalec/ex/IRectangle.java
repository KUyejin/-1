package com.javalec.ex;

public class IRectangle implements IShape{ //인터페이스 사용하면 다형성사용하겠다는 것
	
	private double width;
	private double  height;
	
	public IRectangle() {};
			
	public IRectangle(double  width, double  height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double  getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	public double  getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}


	@Override
    public double getArea() {
	   
		return width*height;
	}    
	


}
