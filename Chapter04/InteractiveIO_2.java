//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 4 / Section 4.5 / Page 104
//		Improved implementation of InteractiveIO class
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
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	public void write(String s) {
		this.writeAndFlush(s);
	}

	public String promptAndRead(String s) throws Exception {
		this.writeAndFlush(s);
		return br.readLine();
	}

	public void writeAndFlush(String s) {
		System.out.print(s);
		System.out.flush();
	}

	private BufferedReader br;
}
