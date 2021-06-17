package JavaPart1Assignments;

import java.util.*; // Import the Scanner class

public class ConditonalOperator {

	public static void main(String[] args) {

		// greater of 3 numbers
		int num1 = 25;
		int num2 = 78;
		int num3 = 87;

		if (num1 > num2 && num1 > num3) {
			System.out.println("nummber 1 is greter: " + num1);
		} else if (num2 > num3) {
			System.out.println("nummber 2 is greter: " + num2);
		} else {
			System.out.println("nummber 3 is greter: " + num3);
		}

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter an integer");
		int i;
		i = s1.nextInt();

		// number is positive or negative
		// int i = 25;
		if (i >= 0) {
			System.out.println("input number is positive");
		} else {
			System.out.println("Input number is negative");
		}

	}

}
