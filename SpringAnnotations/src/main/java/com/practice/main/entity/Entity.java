package com.practice.main.entity;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	
	public Entity(int id, int age) {
		super();
		this.id = id;
		this.age = age;
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
