//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 6 / Section 6.6.8 / Page 216
//	A sample use of the Time class
//------------ 

//------------
// Notes
//	- This program requires the Time class
//	- !!!! Differences from the code in the text !!!!
//		The test t3.isAfter(t4) in the text should be
//			t3.isBefore(t4)
//------------

class TimeUser {
	public static void main(String [] args) {
		Time t1 = new Time(10,15, "am");
		Time t2 = new Time(3,10, "pm");

		Time t3 = t2.addDuration(30);	//add 30 minutes
		t3.print(System.out);			//prints3:40pm
		System.out.println();

  		Time t4 = t2.addDuration(3,30);	// add 3 hours, 30 min
		t4.print(System.out);			// prints 6:40pm
   		System.out.println();

   		Time earlier;
    	Time later;

   		if (t3.isBefore(t4)) {
    		earlier=t3;
   			later=t4;
		}
		else {
			earlier=t4;
			later=t3;
		}

		earlier.print(System.out);
		System.out.print(" is earlier than ");
		later.print(System.out);
		System.out.println();
	}
}