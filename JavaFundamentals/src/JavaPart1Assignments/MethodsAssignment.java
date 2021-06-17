package JavaPart1Assignments;

public class MethodsAssignment {
	public static void main(String[] args) {

		System.out.println("--Methods Assignment --");
		System.out.println();

		MethodsAssignment methodObj = new MethodsAssignment();
		
		double total = methodObj.sumOfTwoNumbers(100, 15);
		System.out.println();
		System.out.println("Sum of tow numbers is: " + total);
		
		System.out.println();
		double product = methodObj.ProductOfTwoNumbers(20, 25);
		System.out.println("Product of two numbers is: " + product);
	}

	public double sumOfTwoNumbers(double num1, double num2) {
		return (num1 + num2);
	}

	public double ProductOfTwoNumbers(double num1, double num2) {
		return (num1 * num2);
	}

}
