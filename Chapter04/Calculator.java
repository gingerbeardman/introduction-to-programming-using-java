//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 4 / GUI Supplement / Page 136-137
//	Laying out a calculator applet
//------------ 

//------------
// Notes
//	- This applet may be run by opening the file 'Calculator.html'
//		in a browser or appletviewer.
//	!!!! Differences from the code in the text !!!!
//	- To avoid a 'deprecated API' warning, the following changes
//		have been made:
//			The invocation of the 'resize' method has been replaced with
//				an invocation of the 'setSize' method.
//			The invocation of the 'size' method has been replaced with
//				and invocation of the 'getSize' method.
//------------

import java.awt.*;
import java.applet.Applet;

public class Calculator extends Applet {
	private Button makeButton(String label, Color color) {
		Button		b = new Button(label);
		b.setBackground(color);
		b.setFont(new Font("Courier", Font.BOLD, 10));
		return b;
	}

	private Panel makePanel(LayoutManager lm, Color c) {
		Panel		p = new Panel();
		p.setLayout(lm);
		p.setBackground(c);
		return p;
	}

	private void makeButtons() {
		Color		lightRed = new Color(255,100,100);
		Color		lightBlue = new Color(100,100,255);
		Color		yellow = new Color(255,255,0);

		c = makeButton("C",lightRed);
		eq = makeButton("=",lightBlue);
		div = makeButton("/",lightBlue);
		times = makeButton("*",lightBlue);
		d7 = makeButton("7",yellow);
		d8 = makeButton("8",yellow);
		d9 = makeButton("9",yellow);
		minus = makeButton("-",lightBlue);
		d4 = makeButton("4",yellow);
		d5 = makeButton("5",yellow);
		d6 = makeButton("6",yellow);
		plus = makeButton("+",lightBlue);
		d1 = makeButton("1",yellow);
		d2 = makeButton("2",yellow);
		d3 = makeButton("3",yellow);
		d0 = makeButton("0",yellow);
		dp = makeButton(".",yellow);
		eq2 = makeButton("=",lightBlue);
	}

	public void init() {
		background = new Color(200,255,255);
		this.setLayout(new FlowLayout(FlowLayout.CENTER,4,1));

		result = new Label("0.00000 ",Label.RIGHT);
		result.setBackground(new Color(255,255,255));
		add(result);

		makeButtons();
		row1 = makePanel(new FlowLayout(FlowLayout.LEFT,4,2),background);
		row1.add(c);
		row1.add(eq);
		row1.add(div);
		row1.add(times);

		row2 = makePanel(new FlowLayout(FlowLayout.LEFT,4,2),background);
		row2.add(d7);
		row2.add(d8);
		row2.add(d9);
		row2.add(minus);

		row3 = makePanel(new FlowLayout(FlowLayout.LEFT,4,2),background);
		row3.add(d4);
		row3.add(d5);
		row3.add(d6);
		row3.add(plus);

		add(row1);
		add(row2);
		add(row3);

		p12 = makePanel(new BorderLayout(2,2),background);
		p12.add("West",d1);
		p12.add("East",d2);

		p120 = makePanel(new BorderLayout(2,2),background);
		p120.add("North",p12);
		p120.add("South",d0);

		p3p = makePanel(new BorderLayout(2,2),background);
		p3p.add("North",d3);
		p3p.add("South",dp);

		p3peq = makePanel(new BorderLayout(2,2),background);
		p3peq.add("West",p3p);
		p3peq.add("East",eq2);

		add(p120);
		add(p3peq);

		setBackground(background);
	}

	public void paint(Graphics g) {
		setSize(row1.getSize().width, 8*d1.getSize().height);
		validate();
	}

	Panel		row1, row2, row3, p12, p120, p3p, p3peq;
	Button		c, eq, div, times,
				d7, d8, d9, minus,
				d4, d5, d6, plus,
				d1, d2, d3,
				d0, dp, eq2;
	Color		background;
	Label		result;
}
