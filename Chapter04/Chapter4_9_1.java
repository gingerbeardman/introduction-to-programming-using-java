//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 4 / Section 4.9 / Page 120
//		Sample use of class Name's print method
//------------ 

//------------
// Notes:
//	This program requires the version of the Name class containing 
//		a print method (Name_2.java).
//	!!!! Differences from the code in the text !!!!
//		This program differs from the one in the text in that
//		it writes the output to a file named "Chapter4_9_1.out"
//		rather than "Americas.Most.Wanted"
//	The System.out output for this program may be found in 
//		the file "Chapter4_9_1.out2"
//	- Compiling this program generates the following warning which
//		may be ignored:
//			'Chapter4_9_1.java uses a deprecated API.  Recompile 
//			with "-deprecation"	for details.'
//------------

import java.io.*;

class Chapter4_9_1 {
	public static void main(String arg[]) throws Exception {
		Name n;
		PrintStream p;

		n = new Name("Alvin","Karpis");
		n.setTitle("Public Enemy Number One");
		p = new PrintStream(new FileOutputStream("Chapter4_9_1.out"));

		n.print(System.out);

		n.print(p);

	}
}
