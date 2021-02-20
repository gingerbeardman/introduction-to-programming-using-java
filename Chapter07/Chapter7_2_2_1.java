//------------
// Introduction to Programming Using Java: 
//		An Object-Oriented Approach
//	Arnow/Weiss
// Addison Wesley, 1998
//------------

//------------
// Chapter 3 / Section 3.7 / Page 72
//		Use of prompts (without flushing)
//------------ 

//------------
// Notes:
//		This program differs from the book in that the string
//		"0" is supplied as the argument of parseInt.
//------------


import java.io.*;

class Chapter7_2_2_1 {
	public static void main(String arg[]) {
		int w, x;
		x = Integer.parseInt("0");
		w = 10 / x;
	}
}

