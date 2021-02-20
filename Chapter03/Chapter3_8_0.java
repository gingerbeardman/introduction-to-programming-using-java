//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------


//------------
// Chapter 3 / Section 3.8 / Page 74
//		Creating and writing to a PrintStream object for subsequent
//			input
//------------ 

//------------ 
// Notes:
//	- This program does not correspond to any code in the text. It
//		is used to create the file required in the program
//		corresponding to class Chapter3_8_1.
//	- This program creates a disk file named 'Americas.Most.Wanted'.
//	- Compiling this program generates the following warning which
//		may be ignored:
//			'Chapter3_8_0.java uses a deprecated API.  Recompile 
//			with "-deprecation"	for details.'
//------------ 

import java.io.*;

class Chapter3_8_0 {
	public static void main(String arg[]) throws Exception {
		PrintStream	target = new PrintStream(
								new FileOutputStream(
									new File("Americas.Most.Wanted")));
		target.println("Titanic");
		target.println("Ty Beanie Babies");
	}
}
