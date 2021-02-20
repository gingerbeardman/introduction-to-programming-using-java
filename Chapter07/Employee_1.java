//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 7 / Section 7.3 / Page 251
//	Adding a test driver to the Employee class
//------------ 

//------------
// Notes
//	- To compile, rename (or copy) the source file to Employee.java
//	- Run the program testEmployee to see an invocation of the 
//		testDriver method. 
//	- !!!! Differences from the code in the text !!!!
//		There is no getRate method defined for class Employee
//			in Chapter 6. The code below access the instance 
//			variable directly. Alternatively the rate need
//			not be printed.
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

		System.out.print("Employee name: ");
		System.out.println(e.getName());
		System.out.print("Rate: ");
		System.out.println(e.rate);
		System.out.print("Hours: ");
		System.out.println(hours);
		System.out.print("Pay: ");
		System.out.println(e.calcPay(hours));
	}

	private String name;
	private int rate;
	private int lastWeeksOvertime;
}
