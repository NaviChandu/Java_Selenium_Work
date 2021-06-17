package JavaPart1;

public class LoopsConcept {

	public static void main(String[] args) {

		// 1. while loop: Entry Control Loop
		// 1 to 10
		int i = 1;// Initialization (counter)
		while (i <= 10) {// Conditional
			System.out.println(i);// logic
			i++; // Incremental/Decremental
		}
		// 10 to 1
		System.out.println("---------");

		int p = 2;
		while (p <= 10) {
			System.out.println(p + 2);
			p = p + 2;
		}
		
		System.out.println("---------");


		// for loop: will be used, when u have to print the values from Array or ArrayList or Order based collection
		for (int j = 1; j <= 10; j++) {
			System.out.println(j);// 1 2 3
		}
		
		System.out.println("---------");

		
		for(int k=1; k<=10; k++){
			if(k==5){
				System.out.println("hey this is 5");
				break;
			}
			System.out.println(k);
			
		}
		
		System.out.println("---------");

		//odd numbers 1 to 10: 1 3 5 7 9
		for(int o=1; o<=10; o=o+2){
			System.out.println(o);
		}
		System.out.println("---------");

		//even numbers: 1 to 10: 2 4 6 8 10
		for(int e=0; e<=10; e=e+2){
			System.out.println(e);
		}
		System.out.println("---------");

		//do-while: first do and then while
		//Exit Control Loop:
		int x = 20;
		do{
			System.out.println(x);
		} 
		while(x<20);
		
		
	}

}
