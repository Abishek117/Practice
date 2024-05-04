package com.practice.package1;

public class Class2 implements Interface1 {
	private int a;
	private int b;
	
	public Class2(int i)
	{
		this.a = i;
	}
	
	

	public Class2() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public  int running(int a, int b) {
		int c = a + b;
		return c;
	}
	
	
	
}
