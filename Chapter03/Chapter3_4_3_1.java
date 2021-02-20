//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 3 / Section 3.4.3 / Page 64
//		Creating and writing to a PrintStream object
//------------ 

//------------
// Notes
//	- This program corrsponds to a code fragment.
//	- This program will create a file named 'data.out'
//	- Compiling this program generates the following warning which
//		may be ignored:
//			'Chapter3_4_3_1.java uses a deprecated API.  Recompile 
//			with "-deprecation"	for details.'
//------------

import java.io.*;

class Chapter3_4_3_1 {
	public static void main(String arg[]) throws Exception {
		File diskFile = new File("data.out");
		FileOutputStream diskFileStream =
						new FileOutputStream(diskFile);
		PrintStream	target  = 
						new PrintStream(diskFileStream);
		target.println("Hello Disk File");
	}
}
