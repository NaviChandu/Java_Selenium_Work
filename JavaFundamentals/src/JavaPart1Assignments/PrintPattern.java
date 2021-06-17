package JavaPart1Assignments;

public class PrintPattern {

	public static void main(String[] args) {
		int counter = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 10; j++) {
				String str = String.format("%02d", (counter + j));
				System.out.print(str);
				System.out.print(" ");
			}
			counter = counter + 10;
			System.out.println();
		}

	}

}
