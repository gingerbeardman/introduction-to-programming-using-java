//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------


//------------
// Chapter 3 / Section 3.3 / Page 61
//	Illustrates renaming a file using File objects
//------------ 

//------------
// Notes
//	- This program corresponds to a code fragment.
//	You must run the program for class Chapter3_3_1_1
//		before running this program. That program creates the
//		file 'garbage' (by renamingt the file 'junk').
//------------

import java.io.*;

class Chapter3_3_1_2 {
	public static void main(String arg[]) throws IOException {
		File f = new File("garbage");
		f.delete();
	}
}

