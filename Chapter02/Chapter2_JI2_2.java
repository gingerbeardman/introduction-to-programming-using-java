//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 2 / Java Interlude - More Than One Method / Page 46
//		Illustration of composition 
//------------ 

import java.io.*;

class Chapter2_JI2_2 {
	public static void main(String arg[]) throws Exception {
		String		first = "John";
		String		middle = "Fitzgerald";
		String		last = "Kennedy";
		String		initials;
		String		firstInit, middleInit, lastInit;

		firstInit = first.substring(0,1);
		middleInit = middle.substring(0,1);
		lastInit = last.substring(0,1);

		initials = firstInit.concat(middleInit.concat(lastInit));

		System.out.println(initials);
	}
}
