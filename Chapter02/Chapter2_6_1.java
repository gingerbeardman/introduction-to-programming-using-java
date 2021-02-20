//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 2 / Section 2.6 / Page 39
//	Concatenation code fragment
//------------ 

//------------
// Notes
//	This appears as a code fragment in the text. 
//------------


import java.io.*;

class Chapter2_6_1 {
	public static void main(String arg[]) {
		String s, t, u;
		s = "ham";
		t = "burger";
		u = s.concat(t);
		System.out.print("s = ");
		System.out.println(s);
		System.out.print("t = ");
		System.out.println(t);
		System.out.print("u = ");
		System.out.println(u);
	}
}
