package com.qianyu.fundamental.entity;

import org.springframework.stereotype.Component;

@Component
public class User {
	private String userName;
	

	public User() {
		System.out.println("===============USER instance is created.===================");
		
	}
	


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void presentUser() {
		System.out.println("-----------I'm a user.-------");
	}


}
