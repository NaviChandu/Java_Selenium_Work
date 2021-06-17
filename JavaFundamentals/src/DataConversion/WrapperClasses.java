package DataConversion;

public class WrapperClasses {

	public static void main(String[] args) {

		String x = "100";
		System.out.println(x + 20); // output : 10020

		int parseint = Integer.parseInt(x);

		// parse int is static since we can access by class name
		System.out.println(parseint + 20);

		// when we read data from webpage, we get it in string.

		String fare = "1000";
		// int fareValue = Integer.parseInt(fare);

		int fareValue = WrapperClasses.getIntegerValue(fare);

		int cashback = 100;
		// int finalTotal = fareValue - cashback;
		System.out.println(fareValue - cashback);

		// will get "NumberFormatException for the below code.
		// String s = "110A";
		// int in = Integer.parseInt(s);
		// System.out.println(in+10);

		String sd = "12.33";
		double d = WrapperClasses.getdoubleValue(sd);
		System.out.println(d + 20);

		// NULL pinter exception
		// String name = null;
		// double d1 = WrapperClasses.getdoubleValue(name);
		// System.out.println(d1);

		// String to Integer use "VALUEOF"
		int amount = 1000;
		System.out.println(amount + 200 - 20);
		String amt = WrapperClasses.getStringValue(amount);
		System.out.println(amt + 100); // String concatenation

		int p = 9;
		int q = p / 3;
		System.out.println(q);

		// int p1=9;
		// System.out.println(0/1);
		//
		// // ArithmenticException: / by Zero exception
		// int q1= p1/0;
		// System.out.println(q1);

	}

	/**
	 * This method is used to convert a String value to Integer value
	 * 
	 * @param Value
	 * @return int
	 */
	public static int getIntegerValue(String Value) {
		return Integer.parseInt(Value);
	}

	/**
	 * This method is used to convert a string value to double
	 * 
	 * @param value
	 * @return double
	 */
	public static double getdoubleValue(String value) {
		return Double.parseDouble(value);
	}

	/**
	 * 
	 * @param value
	 * @return String using Valueof
	 */

	public static String getStringValue(int value) {
		// Value of method is overloaded
		return String.valueOf(value);
		// valueOf has same method with different parameters - method overloading.
	}

}
