//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 3 / Section 3.7 / Page 73
//		Use of prompts (with flushing)
//------------ 

//------------
// Notes:
//	- This program corresponds to a code fragment.
//	- This program will always function in the expected
//		manner because the prompt is flushed prior to 
//		performing input.
//------------

import java.io.*;

class Chapter3_7_2 {
	public static void main(String arg[]) throws IOException {
		InputStreamReader isr;
		BufferedReader keyboard;
		String inputLine;

		isr = new InputStreamReader(System.in);
		keyboard = new BufferedReader(isr);

		System.out.println("Type in a word to be pluralized, please ");
		System.out.flush();
		inputLine = keyboard.readLine();

		System.out.print(inputLine);
		System.out.println("s");
	}
}