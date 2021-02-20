//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 3 / Section 3.8 / Page 75-76
//		Copying a file
//------------ 

//------------ 
// Notes
//	- You must have a file on your disk that contains at least two 
//		lines of text. You can use the  file "Americas.Most.Wanted"
//		created by the program for class Chapter3_8_0.
//	- Compiling this program generates the following warning which
//		may be ignored:
//			'CopyFile.java uses a deprecated API.  Recompile 
//			with "-deprecation"	for details.'
//------------ 

import java.io.*;

class CopyFile {
	public static void main(String arg[]) throws IOException {
		InputStreamReader isrKeyboard;		// For modelling the keyboard
		BufferedReader keyboard;

		String fileNameOrig;				// For modelling the input
		File fOrig;
		FileInputStream	fisOrig;
		InputStreamReader isrOrig;
		BufferedReader rdrOrig;

		String fileNameCopy;				// For modelling the output
		File fCopy;							//	going to the file
		PrintStream psCopy;
		FileOutputStream fosCopy;

		String s;

		isrKeyboard = new InputStreamReader(System.in);	// Access keyboard
		keyboard = new BufferedReader(isrKeyboard);

		// Read name and create name of backup file
		System.out.print("name of file to copy: ");		
		System.out.flush();								
		fileNameOrig = keyboard.readLine();
		fileNameCopy = fileNameOrig.concat(".copy");

		// Access original file
		fOrig = new File(fileNameOrig);
		fisOrig = new FileInputStream(fOrig);
		isrOrig = new InputStreamReader(fisOrig);
		rdrOrig = new BufferedReader(isrOrig);

		// Arrange to write to backup file
		fCopy = new File(fileNameCopy);
		fosCopy = new FileOutputStream(fCopy);
		psCopy = new PrintStream(fosCopy);

		// Read two lines from original file and
		//	write to backup
		s = rdrOrig.readLine();
		psCopy.println(s);
		s = rdrOrig.readLine();
		psCopy.println(s);
	}
}





