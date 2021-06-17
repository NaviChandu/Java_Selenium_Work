package JavaPart1Assignments;

import java.util.Scanner;

public class MethodFactorial {
	public static void main(String[] args) {

		System.out.println("--Factorial--");
		System.out.println();

		// Scanner s1 = new Scanner(System.in);
		// System.out.println("Enter an integer");
		// int num1;
		// num1 = s1.nextInt();

		MethodFactorial objfact = new MethodFactorial();

		// Input the number here
		int num = 5;

		int fact = objfact.mothodFact(num);
		System.out.println("Factorial of " + num + " is : " + fact);

		num = 1;

		int fact1 = objfact.mothodFact(num);
		System.out.println("Factorial of " + num + " is : " + fact1);

		num = 2;

		int fact2 = objfact.mothodFact(num);
		System.out.println("Factorial of " + num + " is : " + fact2);

	}

	public int mothodFact(int num1) {
		int fact = 1;
		for (int i = 1; i <= num1; i++) {
			fact = fact * i;
		}
		return fact;
	}

}
