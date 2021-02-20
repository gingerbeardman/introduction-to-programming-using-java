//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 3 / Section 3.4.4 / Page 64
//		Creating and writing to a PrintStream object (using
//			composition)
//------------ 

//------------
// Notes
//	- This program corresponds to a code fragment
//	- This program creates a disk file named 'data.out'.
//	- Compiling this program generates the following warning which
//		may be ignored:
//			'Chapter3_4_4_1.java uses a deprecated API.  Recompile 
//			with "-deprecation"	for details.'
//------------

import java.io.*;

class Chapter3_4_4_1 {
	public static void main(String arg[]) throws Exception {
		PrintStream	target = new PrintStream(
								new FileOutputStream(
									new File("data.out")));
		target.println("Hello Disk File");
	}
}
