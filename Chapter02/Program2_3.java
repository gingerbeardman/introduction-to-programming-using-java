//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 2 / Java Interlude- Variables and Assignment / Page 38
//		Third variation of "Yo world" program
//------------ 

//------------
// Notes
//	To compile, rename (or copy) the source file to Program2.java
//------------

import java.io.*;

class Program2 {
	public static void main(String arg[]) throws Exception {
		String		greeting = "Yo, World";
		String		bigGreeting = greeting.toUpperCase();
		System.out.println(greeting);
		System.out.println(bigGreeting);
	}
}

