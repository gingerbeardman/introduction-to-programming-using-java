//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 3 / Section 3.6 / Page 71
//		Reading data from the keyboard
//------------ 

//------------
// Notes
//	When this program is run, nothing will happen-- the program
//		is waiting for input. You must first enter the string you
//		wish to be pluralized. 
//------------

import java.io.*;

class Program4 {
	public static void main(String arg[]) throws IOException {
		InputStreamReader isr;
		BufferedReader keyboard;
		String inputLine;

		isr = new InputStreamReader(System.in);
		keyboard = new BufferedReader(isr);

		inputLine = keyboard.readLine();
		System.out.print(inputLine);
		System.out.println("s");
	}
}