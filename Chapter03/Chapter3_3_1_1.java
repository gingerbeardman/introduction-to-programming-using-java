//------------
// Notes
//	To compile, rename (or copy) the source file to .java
//------------


//------------
// Chapter 3 / Section 3.3 / Page 62
//	Illustrates renaming a file using File objects
//------------

//------------
// Notes
//	- This program corresponds to a code fragment.
//	- You must first run the program for class Chapter3_4_1_1 before 
//		running this program. That program creates the files 'junk'
//		which this program renames to 'garbage'.
//------------ 

import java.io.*;

class Chapter3_3_1_1 {
	public static void main(String arg[]) throws IOException {
		File f1 = new File("junk");
		File f2 = new File("garbage");
		f1.renameTo(f2);
	}
}

