//------------
// Introduction to Programming Using Java: 
//		An Object-Oriented Approach
//	Arnow/Weiss
// Addison Wesley, 1998
//------------

//------------
// Chapter 4 / Section 4.8 / Page 118
//		Illustrates state and behavior
//------------ 

//------------
// Notes:
//	- This progrsam requires the Name class
//	- !!!! Differences from the code in the text !!!!
//		This program differs from the text in that it uses
//			the write method of InteractiveIO, rather than the
//			writeln method (which is an exercise). It therefore
//			performs a println when appropriate.
//------------

import java.io.*;

class Program4 {
	public static void main(String arg[]) throws IOException {
		Name n1, n2;

		InteractiveIO io = new InteractiveIO();
		n1 = new Name("Tom","Petty");
		n2 = new Name("Alanis","Morrisette");
		io.write(n1.getLastFirst());
		System.out.println();
		io.write(n2.getLastFirst());
		System.out.println();
	}
}