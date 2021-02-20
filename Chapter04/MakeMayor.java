
//------------
// Introduction to Programming Using Java: 
//		An Object-Oriented Approach
//	Arnow/Weiss
// Addison Wesley, 1998
//------------

//------------
// Chapter 4 / Section 4.10.2 / Page 125
//		Sample use of final revised Name class
//------------ 

//------------
// Notes:
//	- This program requires the revised Name class containing 
//		read and print methods.
//	- This program first reads a Name from the keyboard using
//		the read method of the revised Name class. This method
//		does not use use interactive i/o and therefore no prompt
//		is displayed. You must enter a first name followed by
//		a last name (two separate lines of input) before the
//		read method will create and return a Name object. 
//------------

import java.io.*;

class MakeMayor {
	public static void main(String[] a) throws Exception {
		Name mayor;

		mayor = Name.read(new BufferedReader(
							new InputStreamReader(System.in)));
		mayor.setTitle("His Honor, the Mayor");
		mayor.print(System.out);
	}
}

