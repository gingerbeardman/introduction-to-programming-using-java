//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------


//------------
// Chapter 4 / Section 4.10 / Page 123
//		The Name class with a read and readi (and print) method
//------------ 

//------------
// Notes:
//	- To compile, rename (or copy) this file to Name.java
//	- Run the program for class Chapter4_10_1.java for a sample 
//		use of this class.
//	- !!!! Differences from the code in the text !!!!
//		The read and readi methods in the text are missing a
//			'throws Exception' in the method headers.
//------------

import java.io.*;

class Name {
	public Name(String first, String last) {
		firstName = first;
		lastName = last;
		title = "";
	}

	public String getInitials() {
		String s;
		s = firstName.substring(0,1);
		s = s.concat(".");
		s = s.concat(lastName.substring(0,1));
		s = s.concat(".");
		return s;
	}

	public String getLastFirst() {
		return lastName.concat(", ").concat(firstName);
	}

	public String getFirstLast() {
		return title.concat(" ").
					concat(firstName).
					concat(" ").concat(lastName);
	}

	public void setTitle(String newTitle) {
		title = newTitle;
	}

	void print(PrintStream target) {
		target.print(this.title);
		target.print(" ");
		target.print(this.firstName);
		target.print(" ");
		target.print(this.lastName);
	}

	public static Name read(BufferedReader br) throws Exception {
		String first, last;

		first = br.readLine();
		last = br.readLine();
		return new Name(first,last);
	}

	public static Name readi(InteractiveIO io) throws Exception {
		String first, last;

		first = io.promptAndRead("First name: ");
		last = io.promptAndRead("Last name: ");
		return new Name(first,last);
	}

	private String			firstName;
	private String			lastName;
	private String			title;
}

