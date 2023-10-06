package com.qianyu.fundamental;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.qianyu.fundamental.entity.Student;

@SpringBootApplication
public class FundamentalApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext apc = SpringApplication.run(FundamentalApplication.class, args);
		
		//to print bean names in container
		for (String s: apc.getBeanDefinitionNames()) {
			System.out.println(s);
		}
		
		//Once spring starts, it will give you the bean object
		//Here you can see that you can get student instance directly
		
		Student stu = apc.getBean(Student.class);
		
		stu.present();
	}
	
	//Normally we don't do it like this, but here just to demostrate
	@Bean
	public int getId() {
		return 1;
	}

}
