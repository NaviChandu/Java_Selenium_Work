package Waits_Video8_9;

public class StaticWait {
	
	public static void main(String[] args) throws InterruptedException {
		
		//static wait:
		//we have wait of 3 seconds in a method and the method is called 100 times.
		//the script will be caused for 300 seconds.
		// it will degrade the performance
		
		System.out.println("AAA");
		
		Thread.sleep(2000);
		
		System.out.println("AAA");
		
		//wait for 10 seconds and then find an element.
		
		//if the element is abailbe in 1 seconds still the thread.sleep() will be waiting for 10 seconds.
		
		//if there are 100 of elements, it will degrade the performance.
		
		//the sleep gets interupted, it will handle and it wait for 10 seconds.
				
	}

}
