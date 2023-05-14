package com.practice.main.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Class2 implements Classes
{

	@Override
	public String sayHeloo() 
	{
		return "Helo Class2";
	}

}
