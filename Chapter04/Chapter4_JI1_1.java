//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 4 / Java Interlude - Variables, ... / Page 108
//	Illustrating using the 'this' keyword to access
//		'hidden' instance variables.
//------------ 

//------------
// Notes:
//	- This program does not appear in the text. It loosely
//		corresponds to the fragments on page 108
//	- This source file contains two class definitions -- 
//		the class ThisDemoClas contains the methods illustrating
//		the use of this. The class Chapter4_JI1_1 contains
//		a main method which creates a 'ThisDemoClass' object
//		and invokes the two methods.
//------------

import java.io.*;

class Chapter4_JI1_1 {
	public static void main(String arg[]) {
		ThisDemoClass tdc = new ThisDemoClass();
		tdc.needsThis();
		tdc.doesNotNeedThis();
	}

}

class ThisDemoClass {
	public ThisDemoClass() {
		s = "I am the instance variable";
	}

	public void needsThis() {
		// In this method, the instance variable s must be 
		//	accessed using 'this' since it is hidden
		//	by a local variable with the same name
		String s = "I am the local variable";
		System.out.println("--- In the method 'needsThis'");
		System.out.print("s = ");
		System.out.println(s);
		System.out.print("this.s = ");
		System.out.println(this.s);		
	}

	public void doesNotNeedThis() {
		// In this method, the instance variable s may be 
		//	accessed without using 'this' since it is not hidden
		//	by a local variable
		System.out.println("--- In the method 'doesNotNeedThis'");
		System.out.print("s = ");
		System.out.println(s);
	}

	String s;
}