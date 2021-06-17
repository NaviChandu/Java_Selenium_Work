package FinalKeyword;

public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i =10;
		i=20;
		i=30;
		
		System.out.println(i);

		final int j= 20;
		//j= 30; // gives a error the final value cannot change
		System.out.println(j);
		
		final int totaldays = 7;
		final int totalmonths = 12;
		final double pi = 3.14;
		final double gst = 18.22;
		final String sunRiseDirection= "East";
		
		final String loginPageTitle = "Login";
		
		
	}

}
