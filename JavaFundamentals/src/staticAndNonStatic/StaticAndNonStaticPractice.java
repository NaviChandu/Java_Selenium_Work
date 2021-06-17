package staticAndNonStatic;

public class StaticAndNonStaticPractice {
	
	String name;
	static int age;
	
	public static void getInfo() {
		System.out.println("get info");
	}
	
	public void getName() {
		System.out.println("get Name");
	}
	
	
	public static void main(String[] args) {
		
		//will get error illegal modifier.
		//static is not applicable for local variavle
		// static is defined at class level not inside any method
		
		//static int i=10; // local variable
		
		
		
	}

}
