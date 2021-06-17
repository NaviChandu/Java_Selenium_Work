package JavaPart1;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		//default class
		//order based collection or Index based
		ArrayList ar = new ArrayList();
		
		System.out.println(ar.size());
		ar.add(10);//0
		ar.add(20);//1
		ar.add(30);//2
		
		System.out.println(ar.size());
		
		ar.add(40);//3
		ar.add(50);//4
		
		System.out.println(ar.size());
		
		ar.add(12.33);//5
		ar.add("selenium");//6
		//0 - 6 =7 
		
		System.out.println("-----");
		//System.out.println(ar.get(7));//IndexOutOfBoundsException
		
		System.out.println(ar.size());

		//ar.remove(3);
		System.out.println(ar.size());
		
		System.out.println(ar.get(1));
		System.out.println(ar.get(3));
				
		System.out.println("-----");
		//to print all the values from arraylist: for loop:
		for(int i=0; i<ar.size(); i++){
			System.out.println(ar.get(i));
		}
			
		System.out.println("-----");

		//Generics in ArrayList
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		//ar1.add("test");
		
		ArrayList<String> studentNames = new ArrayList<String>();
		studentNames.add("Varun");
		studentNames.add("Reena");
		
	}

}
