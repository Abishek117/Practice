package com.practice.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import com.practice.main.beans.ComponentBean;

@SpringBootApplication
public class SpringAnnotationsApplication {

	public static void main(String[] args) 
	{
		ApplicationContext ctx = SpringApplication.run(SpringAnnotationsApplication.class, args);
		
		ComponentBean c = ctx.getBean(ComponentBean.class);
		c.sayHi();
	}

}
