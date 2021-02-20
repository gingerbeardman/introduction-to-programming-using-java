//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 4 / Section 4.9.1 / Page 121
//		The Name class with a print method
//------------ 

//------------
// Notes:
//	- To compile, rename (or copy) this file to Name.java
//	- Run the program for class Chapter4_9_1.java for a sample 
//		use of this class.
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

	private String			firstName;
	private String			lastName;
	private String			title;
}

