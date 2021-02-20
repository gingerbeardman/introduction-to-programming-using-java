//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 2 / Section 2.6 / Page 42
//		Display middle character program
//------------ 

//------------
// Notes
//	To compile, rename (or copy) the source file to Program2.java
//------------

import java.io.*;

class Program2 {
	public static void main(String arg[]) throws Exception {
		String		word = "antidisestablishmentarianism";
		String		middle;
		middle = word.substring( word.length()/2, 1+word.length()/2 );
		System.out.println(middle);
	}
}
