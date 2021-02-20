//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 4 / GUI Supplement / Page 132
//	A first use of GUI controls
//------------ 

//------------
// Notes
//	- This applet may be run by opening the file 'Certs.html'
//		in a browser or appletviewer.
//------------

import java.awt.*;
import java.applet.*;

public class Certs extends Applet {
	public void init() {
		Button breath, candy;
		breath = new Button("Certs is a BREATH mint.");
		candy = new Button("Certs is a CANDY mint.");
		add(breath);
		add(candy);
	}
}