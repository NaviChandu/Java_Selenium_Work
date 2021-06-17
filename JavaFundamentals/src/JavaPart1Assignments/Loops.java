package JavaPart1Assignments;

public class Loops {

	public static void main(String[] args) {
		// Print- "I am Batman" - 5 times
		for (int i = 0; i < 5; i++) {
			System.out.println("I am Batman");
			System.out.println();
		}
		System.out.println("--------------");

		// Loops assignment -2

		for (int j = 1; j < 10; j++) {
			System.out.println("I am Batman " + j);
			// System.out.println();
		}
		System.out.println("--------------");
		// WAP to print 10 to 1 using for, while and do-while loop

		int counter = 10;
		while (counter > 0) {
			System.out.println("printing using  while loop " + counter);
			counter--;
		}
		System.out.println("--------------");
		for (int k = 10; k > 0; k--) {
			System.out.println("printing using for loop " + k);
		}
		System.out.println("--------------");

		int dountil = 10;

		do {
			System.out.println("printing using do-until loop " + dountil);
			dountil--;
		} while (dountil > 0);

		System.out.println("--------------");
		// Write a program in Java to print "Hello World" ten times using while loop and
		// do-while loop
		int counter1 = 0;

		while (counter1 < 10) {
			System.out.println("Hello World");
			counter1++;
		}
		System.out.println("--------------");

		int dountil1 = 0;

		do {
			System.out.println("Hello World");
			dountil1++;
		} while (dountil1 < 10);

		// Write a program in Java to print 1 to 10 using while loop but quit if
		// multiple of 7 is encountered

		System.out.println("--------------");

		int counter2 = 1;

		while (counter2 <= 10) {
			if ((counter2 % 7) != 0) {
				System.out.println(counter2);
			} else {
				break;
			}
			counter2++;
		}

	}

}
