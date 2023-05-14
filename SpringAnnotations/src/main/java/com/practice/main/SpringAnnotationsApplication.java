package com.practice.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.practice.main.beans.Class1;
import com.practice.main.beans.Classes;
import com.practice.main.beans.ComponentBean;
import com.practice.main.entity.Entity;

@SpringBootApplication
public class SpringAnnotationsApplication {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringAnnotationsApplication.class, args);
		
		ComponentBean cb = ctx.getBean(ComponentBean.class);
		System.out.println(cb.say());
		
		Entity e = ctx.getBean(Entity.class);
		System.out.println(e.getId());
	}

}
