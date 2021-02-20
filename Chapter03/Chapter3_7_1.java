//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 3 / Section 3.7 / Page 72
//	Use of prompts (without flushing)
//------------ 

//------------
// Notes:
//	- This code corresponds to a code fragment.
//	- This program may not function in the expected
//		manner because the prompt is not flushed.
//------------

import java.io.*;

class Chapter3_7_1 {
	public static void main(String arg[]) throws IOException {
		InputStreamReader isr;
		BufferedReader keyboard;
		String inputLine;

		isr = new InputStreamReader(System.in);
		keyboard = new BufferedReader(isr);

		System.out.println("Type in a word to be pluralized, please ");
		inputLine = keyboard.readLine();
		System.out.print(inputLine);
		System.out.println("s");
	}
}