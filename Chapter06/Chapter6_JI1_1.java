//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 6 / Java Interlude - The if Statement  / Page 201
//	A sample multiway test - cascaded if's
//------------ 

//------------
// Notes
//	- This class corresponds to a code fragment
//	- The method testForOvertime is static because it requires
//		no receiving object, merely the passed hours.
//------------

import java.io.*;
import java.io.*;

class Chapter6_JI1_1 {
	public static void main(String arg[]) {
		testForOvertime(20);
		testForOvertime(50);
		testForOvertime(70);
	}
	private static void testForOvertime(int hours) {
		System.out.print("hours: " + hours + " -- " );
		if (hours <= 40)
			System.out.println("No overtime");
		else if (hours <= 60)
			System.out.println("Overtime");
		else
			System.out.println("Double overtime");
	}
}

