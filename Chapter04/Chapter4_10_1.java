//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 4 / Section 4.9 / Page 120
//	Sample use of class Name's print method
//------------ 

//------------
// Notes:
//	- This program requires the version of the Name class containing 
//		a read method.
//	- The input for this program comes from the keyboard as
//		well as the file named 'name.list'
//	- This program first reads a Name from the keyboard using
//		the read method of the revised Name class. This method
//		does not use use interactive i/o and therefore no prompt
//		is displayed. You must enter a first name followed by
//		a last name (two separate lines of input) before the
//		read method will create and return a Name object. 
//------------

import java.io.*;

class Chapter4_10_1 {
	public static void main(String arg[]) throws Exception {
		Name n;
		FileInputStream f;
		BufferedReader brFile, brKey;

		brKey = new BufferedReader(
					new InputStreamReader(System.in));
		f = new FileInputStream(new File("name.list"));
		brFile = new BufferedReader(new InputStreamReader(f));

		n = Name.read(brKey);
		n.print(System.out);
		n = Name.read(brFile);
		n.print(System.out);
	}
}
