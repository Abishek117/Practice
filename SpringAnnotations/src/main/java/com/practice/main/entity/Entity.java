package com.practice.main.entity;

import org.springframework.stereotype.Component;

//@Component
public class Entity
{
	private int id;
	private int age;
	
	public Entity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
