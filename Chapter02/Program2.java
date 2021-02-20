//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 2 / Section 2.6 / Page 43
//		Print initials program
//------------ 

//------------
// Notes
//	To compile, rename (or copy) the source file to Program2.java
//------------

import java.io.*;

class Program2 {
	public static void main(String arg[]) throws Exception {
		String		first = "John";
		String		middle = "Fitzgerald";
		String		last = "Kennedy";
		String		initials;
		String		firstInit, middleInit, lastInit;

		firstInit = first.substring(0,1);
		middleInit = middle.substring(0,1);
		lastInit = last.substring(0,1);
		initials = firstInit.concat(middleInit);
		initials = initials.concat(lastInit);
		System.out.println(initials);
	}
}
