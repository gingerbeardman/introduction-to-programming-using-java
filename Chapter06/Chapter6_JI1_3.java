//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 6 / Java Interlude - The if Statement  / Page 203
//	An illustration of the dangling else problem
//------------ 

//------------
// Notes
//	- This class corresponds to a code fragment
//	- The method testForOvertime is static because it requires
//		no receiving object, merely the passed hours.
//	- !!!! This code produces incorrect output !!!!
//------------

import java.io.*;
import java.io.*;

class Chapter6_JI1_3 {
	public static void main(String arg[]) {
		testForOvertime(20);
		testForOvertime(50);
		testForOvertime(70);
	}
	private static void testForOvertime(int hours) {
		System.out.print("hours: " + hours + " -- " );
		if (hours <= 60)
			if (hours >= 40)
				System.out.println("Overtime");
		else
			System.out.println("Double-overtime");

	
	}
}

