//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 6 / Java Interlude - The if Statement  / Page 203
//	An illustration of the switch statement
//------------ 

//------------
// Notes
//	- This class corresponds to a code fragment
//	- !!!! Differences from code in text !!!!
//		The method dayName is made static because it requires
//			no receiving object, merely the passed hours.
//		The day name is not printed in the dayName method. Rather
//			we have the main method print out the returned String.
//------------

import java.io.*;
import java.io.*;

class Chapter6_JI1_5 {
	public static void main(String arg[]) {
		System.out.println("Day 1: " + dayName(1));
		System.out.println("Day 2: " + dayName(2));
		System.out.println("Day 3: " + dayName(3));
		System.out.println("Day 4: " + dayName(4));
		System.out.println("Day 5: " + dayName(5));
		System.out.println("Day 6: " + dayName(6));
		System.out.println("Day 7: " + dayName(7));
		System.out.println("Day 8: " + dayName(8));
	}

	static String dayName(int d) {
		String		dname;
		switch(d) {
			case 1:	dname = "Sunday"; break;
			case 2:	dname = "Monday"; break;
			case 3:	dname = "Tuesday"; break;
			case 4:	dname = "Wednesday"; break;
			case 5:	dname = "Thursday";	break;
			case 6:	dname = "Friday"; break;
			case 7:	dname = "Saturday";	break;
			default: dname = "Unknown day";	break;
		}
		return dname;
	}
}

