//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 3 / Section 3.9.2 / Page 79-80
//		The White House's Web Page
//------------ 

//------------ 
// Notes
//	To execute this program successfully, your computer must 
//		have access to the Internet. (In addition the White house
//		page must be up and running.)
//------------ 

import java.net.*;
import java.io.*;

class WHWWW {
	public static void main(String[] arg) throws Exception {
		URL u = new URL("http://www.whitehouse.gov/");
		URLConnection uC = u.openConnection();
		BufferedInputStream	ins = 
					(BufferedInputStream)uC.getContent();
		InputStreamReader isr = new InputStreamReader(ins);
		BufferedReader whiteHouse = new BufferedReader(isr);

		System.out.println(whiteHouse.readLine());
		System.out.println(whiteHouse.readLine());
		System.out.println(whiteHouse.readLine());
		System.out.println(whiteHouse.readLine());
		System.out.println(whiteHouse.readLine());
	}
}


