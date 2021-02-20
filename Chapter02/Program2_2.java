//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter  2 / Java Interlude - Variables and Assignment  / Page 37-38
//	Printing a greeting, and its upper case equivalent #2
//------------ 

//------------
// Notes
//	To compile, rename (or copy) the source file to Program2.java
//------------

import java.io.*;

class Program2 {
	public static void main(String arg[]) throws Exception {
		String		greeting;
		greeting = "Yo, World";
		String		bigGreeting;
		bigGreeting = greeting.toUpperCase();
		System.out.println(greeting);
		System.out.println(bigGreeting);
	}
}
