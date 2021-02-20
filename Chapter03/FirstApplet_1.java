//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 3 / GUI Supplement / Page 85
//		Everyone's first applet
//------------ 

//------------
// Notes:
//	- To compile, rename (or copy) this file to FirstApplet.java
//	- This applet may be run by opening the file 'FirstApplet.html'
//		in a browser or appletviewer.
//------------

import java.awt.*;
import java.applet.*;

public class FirstApplet extends Applet {
	public void paint(Graphics g) {
		g.drawString("This is everyone's first applet.",20,20);
	}
}