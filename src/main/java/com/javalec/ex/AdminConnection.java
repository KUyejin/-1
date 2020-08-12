package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class AdminConnection implements EnvironmentAware, InitializingBean, DisposableBean {

	private Environment env;
	private String adminId;
	private String adminPw;
	
	public AdminConnection() {};
	
	@Override
	public void setEnvironment(Environment env) { //빈이 생성되는 시점에 그 누구보다 가장 먼저 호출
		System.out.println("setEnvironment()");    //스프링이 알아서 세팅해준다.-> setEnvironment
		setEnv(env);
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {  // ctx.refresh에서 소환
		System.out.println("afterPropertiesSet()");
		setAdminId(env.getProperty("admin.id"));
		setAdminPw(env.getProperty("admin.pw"));
	}

	@Override
	public void destroy() throws Exception { //ctx.close에서 소환
		System.out.println("destroy()");
	}
	
	public void setEnv(Environment env) {
		this.env = env;
	}
	
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	
	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}
	
	public String getAdminId() {
		return adminId;
	}
	
	public String getAdminPw() {
		return adminPw;
	}
	
	

}
