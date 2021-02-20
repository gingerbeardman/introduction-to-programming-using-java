//------------
// Introduction to Programming Using Java: An Object-Oriented Approach
//	Arnow/Weiss
//------------

//------------
// Chapter 6 / Section 6.3.4 / Page 
//	Sample use of the Employee class.
//------------ 

//------------
// Notes
//	- This program requires the Employee class.
//	- !!!! Differences from the code in the text !!!!
//		The text incorrectly has an extra call to calcPay
//			which uses an undeclared variable 'hours'. The
//			correct version is below.
//------------

class Payroll {

	public static void main(String a[]) {
		Employee 	e;
		e = new Employee("Rudy Crew", 10);
		int pay;
		pay = e.calcPay(30);
		System.out.print(e.getName());
		System.out.print(" earned ");
		System.out.println(pay);
	}

}
