package JavaPart1;

public class TimeComplexity {

	public static void main(String[] args) {
		// BIG O
		int i = 10;

		System.out.println(i); // O[1]

		int p = 10 + 20;
		System.out.println(p);

		for (int k = 1; k < 10; k++) {
			System.out.println(k);
		}

		// O(10) -> O(n)
		// i =1 will be executed only once
		// k<10 will be executed 10 times
		/// k++ will be executed 10 times
		// sysout will be executed n times
		// n=10 can be executyed n times
		// formual will be 1+n+n+m = 1+3n --linear equation
		// if we need to execute 1 minnion, i=1 will be negligible.
		// 3n
		// ignoring constant 3
		// time complexity will be O(n)

		// O(1) is a constant

		// time complexity for two for loops - outer and inner loops
		// (1+3n) (1+3n)
		// 1+6n+9n2 --quadratic equation
		// 3(3n2+2n)
		// n2
		// time complexity for two for loops is On)= n2 (n squre)

	}

}
