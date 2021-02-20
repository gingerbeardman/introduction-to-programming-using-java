//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 3 / Section 3.8 / Page 74
//		Obtaining input from disk files
//------------ 

//------------
// Notes:
//	- This program corresponds to a class fragment.
//	- The program for class Chapter3_8_0 (which creates the file
//		"Americas.Most.Wanted") must be run prior to running this 
//		program.
//------------

import java.io.*;

class Chapter3_8_1 {
	public static void main(String arg[]) throws IOException {
		File f = new File("Americas.Most.Wanted");
		FileInputStream	fs = new FileInputStream(f);
		InputStreamReader isr;
		BufferedReader fileInput;

		isr = new InputStreamReader(fs);
		fileInput = new BufferedReader(isr);

		String line;
		line = fileInput.readLine();
		System.out.println(line);
		line = fileInput.readLine();

		System.out.println(line);
	}
}