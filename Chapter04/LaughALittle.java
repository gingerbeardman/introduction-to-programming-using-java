//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 4 / Section 4.2.3 / Page 95
//	Another sample use of Laugher3 class
//------------ 

//------------
// Notes:
//	This program requires the presence of the Laugher3 class.
//------------

import java.io.*;
import java.io.*;

class LaughALittle {
	public static void main(String[] a) {
		System.out.println("Live and laugh!!!");
		Laugher3 x,y;
		x = new Laugher3("yuk");
		y = new Laugher3("harr");
		x.laugh();
		x.laugh("hee");
		y.laugh();
	}
}
