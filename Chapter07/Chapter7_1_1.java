//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 7 / Section 7.1 / Page 246
//	An example of a poor choice of a test case
//------------ 

//------------
// Notes:
//	- This class corresponds to a code fragment
//	- This class requires the DoubleTrouble class
//------------

import java.io.*;

class Chapter7_1_1 {
	public static void main(String arg[]) {
		DoubleTrouble t = new DoubleTrouble(2); 
		System.out.println(t.doubleIt());
	}
}


