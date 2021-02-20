//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 6 / Section 6.6 / Page 214-215
//	A Time class
//------------ 

//------------
// Notes
//	- !!!! Differences from the code in the text !!!!
//		In the public Time constructor, the code in the
//			text is incorrectly missing the calculation
//			of the 'totalMinutes' instance variable.
//		The print method in the text omits a test for 12pm.
//------------

import java.io.*;

class Time {
	public Time(int hours, int minutes, String amOrPm) {
		if (amOrPm.equals("am")) {
			if (hours==12)
				hours = 0;
		}
		else	// pm
			if (hours!=12)
				hours += 12;
		totalMinutes = hours * 60 + minutes;
	}

	private Time(int minutes) {	// Used by addDuration
		this.totalMinutes = minutes;
	}

	public Time addDuration(int minutes) {
		return new Time(minutes+this.totalMinutes);
	}

	public Time addDuration(int hours, int minutes) {
		return new Time(hours*60+minutes+this.totalMinutes);
	}

	public boolean isBefore(Time t){
		return totalMinutes < t.totalMinutes;
	}

	public boolean isAfter(Time t){
		return totalMinutes > t.totalMinutes;
	}

	public void print(PrintStream target){
		int hours = totalMinutes/60;
		boolean isAfternoon;
		if(hours>=12){
			isAfternoon=true;
			if (hours != 12)
				hours-=12;
		}
		else {
			isAfternoon=false;
			if (hours == 0)
				hours = 12;
		}
		target.print(hours);
		target.print(":");
		target.print(totalMinutes%60);

		if(isAfternoon)
			target.print("pm");
		else
			target.print("am");
	}

	int totalMinutes;
}
