package com.javalec.ex;

public class Student {
	
    private String name;
    private String age;
    private String gradeNum;
    private String classNum;
	
    
    public Student() {}; //디폴트 생성자 반드시 있어야함 없으면 나중에 에러 생길 수 있음
        
   
    public Student(String name, String age, String gradeNum, String classNum) {
		super();
		this.name = name;
		this.age = age;
		this.gradeNum = gradeNum;
		this.classNum = classNum;
	}
	
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGradeNum() {
		return gradeNum;
	}
	public void setGradeNum(String gradeNum) {
		this.gradeNum = gradeNum;
	}
	public String getClassNum() {
		return classNum;
	}
	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}
    
    
    
}
