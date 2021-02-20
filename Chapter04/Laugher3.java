//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 4 / Section 4.2.1 / Page 94-95
//		Laugher3 class
//------------ 

//------------
// Notes:
//	Run the program for class Chapter4_2_2_1 for a sample use of 
//		this class.
//------------

class Laugher3 {
	public Laugher3(String s) {
		defaultSyllable = s;
	}

	public void laugh() {
		String laughSound;
		laughSound = defaultSyllable.concat(defaultSyllable);
		System.out.println(laughSound);
	}

	public void laugh(String syllable) {
		String		laughSound;
		laughSound = syllable.concat(syllable);
		System.out.println(laughSound);
	}

	private String defaultSyllable;
}
