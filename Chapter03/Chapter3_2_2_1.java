//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 3 / Section 3.2.2 / Page 58-59
//		Illustration of assigning a reference to a reference
//			variable
//------------ 

//------------
// Notes
//	This class corresponds to a code fragment.
//------------

import java.io.*;

class Chapter3_2_2_1 {
	public static void main(String arg[]) {
		String			s, upper, lower;

		s = new String("Hello");
		upper = s.toUpperCase();
		lower = s.toLowerCase();
		System.out.println(s);

		System.out.print("upper = ");
		System.out.println(upper);
		System.out.print("lower = ");
		System.out.println(lower);

	}
}
