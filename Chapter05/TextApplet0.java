//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 5 / GUI Supplement  / Page 175
//	
//------------ 

//------------
// Notes
//	- This applet may be run by opening the file 'TextApplet0.html'
//		in a browser or appletviewer.
//------------

import java.applet.*;
import java.awt.*;

public class TextApplet0 extends Applet {
	public void paint(Graphics g) {
		g.drawString("Hello ", 20, 20);
		g.drawString("world", 60, 20);

		g.drawString("Hello ", 20, 60);
		g.drawString("world", 40, 60);

	}
}