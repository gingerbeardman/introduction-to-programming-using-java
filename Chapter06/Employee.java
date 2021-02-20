//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 6 / Section 6.3.3 / Page 197-198
//	An Employee class
//------------ 

//------------
// Notes
//	- !!!! Differences from the code in the text !!!!
//		The calcPay method in the text is missing the 'return pay'
//			statement at the end of the method.
//------------

class Employee {
	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
		this.lastWeeksOvertime = 0;
	}

	public int calcPay(int hours) {
		int pay;
		int currentOvertime;
		if (hours <= 40) {
			pay = hours * rate;
			currentOvertime = 0;
		}
		else {
			pay = 40*rate+(hours-40)*(rate+rate/2)	;
			currentOvertime = hours - 40;
		}

		if (currentOvertime + lastWeeksOvertime >= 30) {
			System.out.print(name);
			System.out.print(" has worked 30 or more hours overtime");
		}

		lastWeeksOvertime = currentOvertime;
		return pay;
	}

	public String getName() {
		return this.name;
	}

	private String name;
	private int	rate;
	private int lastWeeksOvertime;
}
