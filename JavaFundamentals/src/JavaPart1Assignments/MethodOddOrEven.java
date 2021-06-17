package JavaPart1Assignments;

import java.util.Scanner;

public class MethodOddOrEven {
	public static void main(String[] args) {
		System.out.println("--Methods Assignment --");
		System.out.println();

		MethodOddOrEven objOddOrEven = new MethodOddOrEven();
		
		String odd = objOddOrEven.oddOrEven(5);
		System.out.println(odd);
		
		String even = objOddOrEven.oddOrEven(10);
		System.out.println(even);	
	}

	public String oddOrEven(int num1) {
		if (num1 % 2 == 0) {
			return "number of even";
		} else
			return "number is Odd";
	}

}
