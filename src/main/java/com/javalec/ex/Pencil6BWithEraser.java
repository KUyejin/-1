package com.javalec.ex;

public class Pencil6BWithEraser implements Pencil{ //인터페이스 사용하면 다형성사용하겠다는 것
	
	@Override
    public void use() {
	    System.out.println("6B이고, 지우개 있습니다");
	}    
    	

}
