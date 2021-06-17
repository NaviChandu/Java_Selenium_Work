package JavaPart1;

public class StringConcatenation {

	public static void main(String[] args) {

		String x = "Hello";
		String y = "World";
		
		int a = 100;
		int b = 200;
		
		double c = 12.33;
		double d = 23.33;
		
		System.out.println(a+b);
		System.out.println(c+d);
		
		System.out.println(x+y);
		
		System.out.println(x+y+a);
		System.out.println(a+x+y);
		
		System.out.println(a+b+x+y);
		
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		
		System.out.println(a+b+x+y+c+d);
		
		System.out.println("the value of a is:" + a);
		System.out.println("the value of b is:" + b);
		System.out.println("the sum of and b is:" + (a+b));

		
		
	}

}
