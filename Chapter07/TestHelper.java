//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 7 / Section 7.4.1 / Page 254
//	The test utility class, TestHelper
//------------ 

//------------
// Notes
//	- Run the program Test to see the verify method in action
//------------

class TestHelper {
	static void verify(boolean testCondition, String message) {
		if (!testCondition) {
			System.out.print("*** Error - test failure: ");
			System.out.println(message);
			Thread.dumpStack();
		}
	}
}
