package com.practice.package1;

import com.practice.main.AbstractClass;

public class Class1 extends AbstractClass implements Interface1
{

	

	/*		public
	 * Members marked as public are accessible from any other class.
	 * There are no restrictions on accessing public members.
	 */
	public int a = 10; 
	
	
	/*		"private"
	 * Members marked as private are accessible only within the same class.
	 * They are not accessible from outside the class, even from subclasses.
	 */
	private int b = 20;
	
	
	
	/*		"protected"
	 * Members marked as protected are accessible within the same class, its subclasses, and classes 
	 * within the same package.They are not accessible from classes outside the package that are not subclasses.
	 */	
	protected int c = 30;
	
	
	/*		"default"
	 * If no access specifier is specified (no public, private, or protected), the default access level is 
	 * package-private.Members with default access are accessible only within the same package.
	 */
	int d = 40;
	
	
	
	@Override
	public void sayHi() {
		System.out.println("Hii");		
	}
	
//	public static void sayHelo()
//	{
//		System.out.println("Helo");
//	}
	
	public static String sayWelcome(String s)
	{
		return s;
	}

	@Override
	public int running(int a, int b) {
		
		return c;
	}
	
	

}
