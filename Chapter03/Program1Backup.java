//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 3 / Section 3.4.4 / Page 65
//		Maintaining a Backup of Screen Output
//------------ 

//------------
// Notes:
//	- This program will create a file called 'backup' on your disk
//	- Compiling this program generates the following warning which
//		may be ignored:
//			'Program1Backup.java uses a deprecated API.  Recompile 
//			with "-deprecation"	for details.'
//------------

import java.io.*;

class Program1Backup {

	public static void main(String arg[]) throws IOException {
		PrintStream	backup;
		FileOutputStream backupFileStream;
		File backupFile;

		backupFile = new File("backup");
		backupFileStream = new FileOutputStream(backupFile);
		backup = new PrintStream(backupFileStream);

		System.out.println("This is my first Java program");
		backup.println("This is my first Java program");
		System.out.println("... but it won't be my last.");
		backup.println("... but it won't be my last.");
	}
}
