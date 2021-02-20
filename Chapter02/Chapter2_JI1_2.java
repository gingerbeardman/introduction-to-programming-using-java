//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 2 / Java Interlude - Variables and Assignment / Page 36
//	Illustrates the independence of variables as described on page 36
//------------ 

import java.io.*;

class Chapter2_JI1_2 {
	public static void main(String arg[]) {
		String		s;
		String		t;
		s = "Inventory";
		t = s;

		System.out.print("s = ");
		System.out.println(s);
		System.out.print("t = ");
		System.out.println(t);

		// Now we change s

		s = "Payroll";

		System.out.print("s = ");
		System.out.println(s);
		System.out.print("t = ");
		System.out.println(t);

	}
}
