//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 5 / GUI Supplement / Page 184
//	Incorrect mixing of graphics and controls
//------------ 

//------------
// Notes
//	- This applet may be run by opening the file 'TextApplet2.html'
//		in a browser or appletviewer.
//------------

import java.applet.*;
import java.awt.*;

public class TextApplet2 extends Applet {
	public void init() {
		add(new Button("Previous"));
		add(new Button("Next"));
		add(new Button("Cancel"));
	}

	public void paint(Graphics g) {
		startY = 0;

		// display current font
        Font f = g.getFont();
        paintTypeface(g, f);

        startY += g.getFontMetrics().getHeight(); // blank line

		// Display the standard fonts
        paintFont(g, "Helvetica", 12);
        paintFont(g, "Courier", 12);
        paintFont(g, "TimesRoman", 12);
        paintFont(g, "Symbol", 12);
        paintFont(g, "Dialog", 12);
    }

    private void paintFont(Graphics g, String fontName,	int startSize) {
        Font f;
        f = new Font(fontName, Font.PLAIN, startSize-2);
        paintTypeface(g, f);
        f = new Font(fontName, Font.PLAIN, startSize);
        paintTypeface(g, f);
        f = new Font(fontName, Font.BOLD, startSize);
        paintTypeface(g, f);
        f = new Font(fontName, Font.ITALIC, startSize);
        paintTypeface(g, f);
        f = new Font(fontName, Font.PLAIN, startSize+2);
        paintTypeface(g, f);

        startY += g.getFontMetrics().getHeight(); // blank line
    }

    private void paintTypeface(Graphics g, Font f) {
		FontMetrics fm;
        String str1 = "Font: ";	// Precedes the font description

        g.setFont(f);
        fm = g.getFontMetrics();

        int startX = 0;					// Start at left edge

        startY += fm.getHeight();		// Go to next line
        g.drawString(str1, 0, startY);	// Draw first string
        startX += fm.stringWidth(str1);	// Space over
        g.drawString(f.toString(), startX, startY);	// Draw font description
    }

   int startY = 0;
}