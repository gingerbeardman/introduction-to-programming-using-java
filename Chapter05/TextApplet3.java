//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 5 / GUI Supplement / Page 186-187
//	Use of Canvas for correctly laying out graphics and controls		
//------------ 

//------------
// Notes
//	- This applet may be run by opening the file 'TextApplet3.html'
//		in a browser or appletviewer.
//------------

import java.applet.*;
import java.awt.*;

public class TextApplet3 extends Applet {
    public void init() {
        setLayout(new BorderLayout());
        add("Center", new TextCanvas());
        Panel p = new Panel();
        add("South", p);
        p.add(new Button("Previous"));
        p.add(new Button("Next"));
        p.add(new Button("Cancel"));
    }
}

class TextCanvas extends Canvas {
  public void paint(Graphics g) {
        startY = 0;

        Font f = g.getFont();
        paintTypeface(g, f);
        startY += g.getFontMetrics().getHeight();

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
        startY += g.getFontMetrics().getHeight();
    }

    private void paintTypeface(Graphics g, Font f) {
        FontMetrics fm;
        String str1 = "Font: ";
        int startX;
        g.setFont(f);
        fm = g.getFontMetrics();
        startX = 0;
        startY += fm.getHeight();
        g.drawString(str1, 0, startY);
        startX += fm.stringWidth(str1);
        g.drawString(f.toString(), startX, startY);
    }

    int startY = 0;
}
