//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 7 / Section 7.4.1 / Page 255
//	An automated test driver for the Employee using the TestHelper
//		class
//------------ 

//------------
// Notes
//	- To compile, rename (or copy) the source file to Employee.java
//	- Run the program testEmployee to see an invocation of the 
//		testDriver method. 
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
	
	public static void testDriver() {
		Employee e = new Employee("Gerald Weiss", 25);
		int hours = 36;
		int correctAnswer = 900;

		System.out.print("Employee name: ");
		System.out.println(e.getName());
		System.out.print("Rate: ");
		System.out.println(e.rate);
		System.out.print("Hours: ");
		System.out.println(hours);

		int computedPay = e.calcPay(hours);
		System.out.print("Pay (computed): ");
		System.out.println(computedPay);
		TestHelper.verify(computedPay == correctAnswer, "calcPay test");
		System.out.println("Test completed successfully!");
	}

	private String name;
	private int	rate;
	private int lastWeeksOvertime;
}
