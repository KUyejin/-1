package com.javalec.ex;

public class Rectangle implements Area{ //인터페이스 사용하면 다형성사용하겠다는 것
	
	private int width;
	private int height;
	
	public Rectangle() {};
			
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}


	@Override
    public double getArea() {
	    System.out.println("사각형의 넓이는 " + width + "*" + height + "=" + width*height);
		return width*height;
	}    
	
	@Override
    public double getArea(double width, double height) {
	  	return width*height;
	}    
    	

}
