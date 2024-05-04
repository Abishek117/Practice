package com.practice.package1;

@FunctionalInterface
public interface Interface1 
{
/*
 * A functional interface must have exactly one abstract method.
 * Functional interfaces can contain multiple default or static methods with implementations.
 * These additional methods are not considered abstract, and their presence does not violate
   the single abstract method requirement.
 * In Functional interfaces, there is no need to use the abstract keyword as it is optional 
   to use the abstract keyword because, by default, the method defined inside the interface is abstract only
 */
	
	public int running(int a ,int b);
	

	default void swimming() {
		
	}
	default void climbing() {
		
	}
	static void working() {
		
	}
	static void sleeping() {
		
	}
}
