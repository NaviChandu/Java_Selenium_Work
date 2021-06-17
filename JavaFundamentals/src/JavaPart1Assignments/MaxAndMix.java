package JavaPart1Assignments;

public class MaxAndMix {
	public static void main(String[] args) {

		MaxAndMix maxAndMin = new MaxAndMix();
		int maxNum = maxAndMin.maxOfThreeNumbers(20, 45, 40);
		System.out.println(maxNum + " is the maximum number");
		
		int numNum = maxAndMin.minOfThreeNumbers(22, 24, 20);
		System.out.println(numNum + " is the min number.");
	}

	public int maxOfThreeNumbers(int num1, int num2, int num3) {
		if (num1 >= num2 && num1 >= num3)
			return num1;
		else if (num2 >= num3)
			return num2;
		else
			return num3;
	}

	public int minOfThreeNumbers(int num1, int num2, int num3) {
		int temp = num1 < num2 ? num1 : num2;
		int result = num3 < temp ? num3 : temp;
		return result;
	}
}
