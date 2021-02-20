//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 4 / Section 4.4 / Page 101-102
//		InteractiveIO class
//------------ 

//------------
// Notes:
//	- To compile, rename (or copy) this file to InteractiveIO.java
//	- Run the program for class TryInteractiveIO for a sample use 
//		of this class.
//------------

import java.io.*;

class InteractiveIO {
	public InteractiveIO() {
	}

	// Write s to the monitor
	public void write(String s) {
		System.out.print(s);
		System.out.flush();
	}

	// Write s to the monitor, read a string from the keyboard,
	//	and return a reference to it.
	public String promptAndRead(String s) throws Exception {
		System.out.print(s);
		System.out.flush();

		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));

		String line;
		line = br.readLine();
		return line;
	}
}
