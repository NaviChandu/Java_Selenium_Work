package JavaPart1Assignments;

public class MethodPrime {

	public static void main(String[] args) {
		System.out.println("--Methods Assignment Prime or nor --");
		System.out.println();

		int num1 = 11;

		MethodPrime objPrime = new MethodPrime();
		objPrime.isPrimeNumber(num1);

		int num2 = 12;

		MethodPrime objPrime1 = new MethodPrime();
		objPrime1.isPrimeNumber(num2);
	}

	public void isPrimeNumber(int num1) {
		// condition for non prime number
		int flag = 0;
		for (int i = 2; i <= (num1)/2; i++) {
			if (num1 % i == 0) {
				System.out.println(num1 + " is a not prime number.");
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println(num1 + " is prime number");
		}
	}
}
