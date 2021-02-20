//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 3 / Section 3.2.1 / Page 58
//		Illustration of reference returned by 'new' operator
//------------ 

//------------
// Notes
//	This class corressponds to a code fragment. It prints out 
//		the String object "hello world" whose reference is 
//		returned by the call to 'new'.
//------------

import java.io.*;

class Chapter3_2_1_1 {
	public static void main(String arg[]) {
		System.out.println(new String("hello world"));
	}
}
