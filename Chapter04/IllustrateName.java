//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 4 / Section 4.6.3 / Page 111
//	A sample program that uses the Name class
//------------ 

//------------
// Notes:
//	- This program requires the Name class.
//	- !!!! Differences from the code in the text !!!!
//		The IllustrateName class definition in the text uses the
//			writeln method of class InteractiveIO, which is
//			presented as Exercise #3 of Section 4.5, and is 
//			not part of the original InteractiveIO class. The
//			class definition below therefore uses only the write
//			method of InteractiveIO. This results in all
//			the output appearing on the same line. To fix this,
//			you can put System.out.println's after each write
//			method invocation that should be a writeln, or
//			you could go back to InteractiveIO and add a writeln 
//			method.
//------------

import java.io.*;

class IllustrateName {
	public static void main(String arg[]) throws Exception {
		Name n;
		String first, last, title;
		InteractiveIO io;

		io = new InteractiveIO();

		first = io.promptAndRead("First name, please: ");
		last  = io.promptAndRead("Last name, please: ");
		title = io.promptAndRead("Title, please: ");
		n = new Name(first,last);

		n.setTitle(title);
		io.write(first);
		io.write(last);
		io.write(title);
		io.write(n.getFirstLast());
		io.write(n.getInitials());
		io.write(n.getLastFirst());
	}
}