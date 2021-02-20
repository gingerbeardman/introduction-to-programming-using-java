//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 4 / Section 4.3.3 / Page 98
//		A sample program that uses the InteractiveIO class
//------------ 

//------------
// Notes:
//		This program requires the InteractiveIO class.
//------------

import java.io.*;

class TryInteractiveIO {
	public static void main(String[] arg) throws Exception {
		InteractiveIO interIO;
		String line;

		interIO = new InteractiveIO();
		line = interIO.promptAndRead("Please type in a word: ");
		interIO.write(line);
	}
}

