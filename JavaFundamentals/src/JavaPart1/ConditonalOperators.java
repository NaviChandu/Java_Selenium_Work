package JavaPart1;

public class ConditonalOperators {

	public static void main(String[] args) {

		int a = 30;
		int b = 20;

		if (a > b) {// true
			System.out.println("a is greater than b");
		} else {
			System.out.println("b is greater than a");

		}

		// nested if:
		int num = 70;
		if (num < 100) {
			System.out.println("number is less than 100");
			if (num > 50) {
				System.out.println("number is greater than 50");
			}
		}

		int total = 1000;
		int bonus = 100;
		if (total == 1000) {
			System.out.println("correct total");
			if (total < 5000) {
				System.out.println("total amount to be paid by user: " + (total - bonus));
			}
		}

		// < > <= >= == !=
		int p = 100;
		int q = 200;
		if (p != q) {
			System.out.println("PASS");
		}

		if (true) {
			System.out.println("PASS");
		} else {// dead code
			System.out.println("FAIL");
		}

		// if-else-if
		int n = 123;
		if (n < 1000 && num >= 1) {// true && true
			System.out.println("PASS");
		}

		if (n < 1000 && n > 500) {// true && false
			System.out.println("Hello");
		}

		if (n < 10 || n > 400) {// false || false
			System.out.println("Hii");
		}

		String browser = "chrome";
		if (browser.equals("chrome")) {
			System.out.println("launch google chrome");
		} else if (browser.equals("firefox")) {
			System.out.println("launch firefox");
		} else if (browser.equals("IE")) {
			System.out.println("launch IE");
		} else if (browser.equals("Opera")) {
			System.out.println("launch Opera");
		} else if (browser.equals("safari")) {
			System.out.println("launch safari");
		} else {
			System.out.println("please define the correct browser name");
		}

		// WAP to find out the max number:
		int x = 500;
		int y = 600;
		int z = 300;

		if (x > y && x > z) {// false && true
			System.out.println("x is the highest number");
		} else if (y > z) {// true
			System.out.println("y is the greatest number");
		} else {
			System.out.println("z is the greatest number");
		}

		// ? :
		int g = 10;
		int h = 20;
		int result = (g < h) ? g : h;
		System.out.println(result);//10

		int result1 = (g > h) ? g : h;//20
		System.out.println(result1);
		
		boolean flag = true;
		if(20>10){
			flag = false;
		}
		
		if(flag){
			System.out.println("test case is passed");
		}else{
			System.out.println("test case is failed");
		}
		
		//data driven
		String execution_flag = "yes";
		if(execution_flag.equals("yes")){
			System.out.println("execute test case");
		}
		
	}

}
