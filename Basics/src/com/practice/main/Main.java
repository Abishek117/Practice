package com.practice.main;

import com.practice.package1.Class1;
import com.practice.package1.Class2;
import com.practice.package1.Interface1;

public class Main {

	public static void main(String[] args) {
		Class1 c1 = new Class1();
//		c1.sayHi();
//		c1.sayHii(0);          //Abstract class can't be accessed directly.we can access abstract classes via it's subclasses.So here, Abstract class's non abstract method is accessed via it's subclass
//		//System.out.println(c1.a);
//		Interface1.sleeping(); //static method in a classes or interface can be accessed just by using the class/interface name
//
		Class2 c2 = new Class2();
//		//System.out.println(c2.getA());
//		c2.swimming();         //default methods in a interfaces can be accessed by it's instances.here class2 acts as a instance of Interface one
//
//		/* Lambda expression
//		   Syntax:
//		      argument -> body
//		 */
//		Interface1 i1 = () -> System.out.println("run");
//		i1.running();
	
		
		
		Interface1 c = (a,b) ->  a*b; // Lambda expression implementation
		int sum = c.running(5, 6); // Using the lambda expression
		System.out.println(sum);
//		
//		
//		// Method reference
//		 /* Static method reference
//		     Syntax:
//		     ClassName::it's static method name
//		 */
//		Interface1 mrs1 = Class1::sayHelo;
//		mrs1.running();
//		
//		
//		/* instance method reference
//           Syntax:
//	       objectOfTheClass::it's methods
//		*/
//		Interface1 mri1 = c1::sayWelcome;
//		mrs1.running();
		
		
		
		
	}

}
