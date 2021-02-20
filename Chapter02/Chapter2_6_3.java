//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 2 / Section 2.6 / Page 41
//		2-argument substring code fragment
//------------ 

//------------
// Notes
//	This appears as a code fragment in the text. 
//------------

import java.io.*;

class Chapter2_6_3 {
	public static void main(String arg[]) {
		String		s, t;
		s = "hamburger";
		t = s.substring(3,7);
		System.out.print("s = ");
		System.out.println(s);
		System.out.print("t = ");
		System.out.println(t);
	}
}
