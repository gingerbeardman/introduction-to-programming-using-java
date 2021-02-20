//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 4 / Section 4.2.1 / Page 92-93
//		Laugher2 class
//------------ 

//------------
// Notes:
//	Run the program for class Chapter4_2_1_1 for a sample use of 
//		this class.
//------------

class Laugher2 {
	public Laugher2() {
	}

	public void laugh() {
		System.out.println("haha");
	}

	public void laugh(String syllable) {
		String laughSound;
		laughSound = syllable.concat(syllable);
		System.out.println(laughSound);
	}
}