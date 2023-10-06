package com.qianyu.fundamental.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private int id;
	
	private User user;
	
	// Here we should that, in default constructor of Student, there's no Courses
	// With autowired, it directs container to search existing bean
	@Autowired
	private Courses courses;
	
	//Spring will take NoArgs contructor by default for instance creation
//	public Student() {
//		System.out.println("===============Student instance is created.===================");
//	}
	
	public Student(int id, User user) {
		System.out.println("===============Student instance is created.===================");
		this.id = id;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	public void present() {
		System.out.println("---------I'm a student------------");
		user.presentUser();
		courses.present();
	}
	
	

}
