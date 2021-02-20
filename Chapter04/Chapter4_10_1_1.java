//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 4 / Section 4.10.1 / Page 123
//	Sample use of the revised class Name's readi method
//------------ 

//------------
// Notes:
//	- This program does not appear in the text. 
//	- This program requires the version of the Name class containing 
//		a readi method (Name_3.java).
//------------

import java.io.*;

class Chapter4_10_1_1 {
	public static void main(String arg[]) throws Exception {
		Name n;
		InteractiveIO io;

		io = new InteractiveIO();
		n = Name.readi(io);
		n.print(System.out);
	}
}
