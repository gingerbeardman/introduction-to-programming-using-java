//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 3 / GUI Supplement / Page 87
//		Everyone's first applet drawing a shape
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
		Color c = new Color(20,120,160);
		g.setColor(c);
		g.fillOval(20,20,60,30);
	}
}

