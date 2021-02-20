//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 6 / GUI Supplement 1 / Page 231-232
//	An applet using the Employee class
//------------ 

//------------
// Notes
//	- This applet may be run by opening the file 'PayrollApplet.html'
//		in a browser or appletviewer.
//------------

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class PayrollApplet extends Applet implements ActionListener {
	public void init() {
		calcButton = new Button("Calc");
		add(calcButton);
		calcButton.addActionListener(this);

		add(new Label("Name"));
		nameField = new TextField(30);
 		add(nameField);

		add(new Label("Rate"));
		rateField = new TextField(5);
		add(rateField);

		add(new Label("Hours"));
		hoursField = new TextField(5);
		add(hoursField);

		resultLabel = new Label("Result goes here");
		add(resultLabel);
	}

	public void actionPerformed(ActionEvent event) {
		String name = nameField.getText();
		int rate = Integer.parseInt(rateField.getText());
		Employee e = new Employee(name, rate);
		int hours = Integer.parseInt(hoursField.getText());
		int pay = e.calcPay(hours);
		String result =
			e.getName().concat(" earned $").concat(Integer.toString(pay));
		resultLabel.setText(result);
		doLayout();
	}

	Button calcButton;
	TextField nameField;
	TextField rateField;
	TextField hoursField;
	Label resultLabel;
}
