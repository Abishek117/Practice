package com.practice.main.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ComponentBean
{
	
	@Autowired
//	@Qualifier("class1")
	Classes c;
	
//	public void sayHii()
//	{
//		System.out.println("Hii....");
//	}
	
//	@Autowired
//	public ComponentBean (@Qualifier("class1") Classes c)
//	{
//		this.c = c;
//	}

	public String say()
	{
		return c.sayHeloo();
	}
	
	
}

