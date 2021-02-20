//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 7 / Section 7.1 / Page 246
//	An example of a poor choice of a test case
//------------ 

//------------
// Notes
//	Run the program Chapter7_1_1 for a sample test of this class
//------------

class DoubleTrouble {
	public DoubleTrouble(int value) {
		this.value = value;
	}

	public int doubleIt() {
		this.value += 2;		// Ooops, adding 2, not multiplying
		return this.value;
	}

	private int value;
}



