package com.practice.main.beans;

import org.springframework.stereotype.Component;

@Component
public class Class1 implements Classes 
{

	@Override
	public String sayHeloo() 
	{
		return "Heloo Class1";
	}

}
