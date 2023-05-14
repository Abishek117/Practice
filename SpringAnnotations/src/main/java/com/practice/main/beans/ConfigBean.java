package com.practice.main.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.practice.main.entity.Entity;

@Configuration
public class ConfigBean
{
	@Bean
	public Entity entity()
	{
		return new Entity(101,23);
	}

}
