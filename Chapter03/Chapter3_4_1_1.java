//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 3 / Section 3.4 / Page 62
//	Creation of a disk file  by creating a FileOutputStream 
//		object.
//------------

//------------
// Notes:
//	- This program corresponds to a code fragment.
//	- This program will create a file named  "junk" on your disk
//	- This program must be run before you run the program for 
//			class Chapter3_3_1_1
//------------ 

import java.io.*;

class Chapter3_4_1_1 {
	public static void main(String arg[]) throws IOException {
		File f = new File("junk");
		FileOutputStream fs = new FileOutputStream(f);
	}
}

