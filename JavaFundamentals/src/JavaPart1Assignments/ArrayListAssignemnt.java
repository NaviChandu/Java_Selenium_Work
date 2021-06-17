package JavaPart1Assignments;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAssignemnt {
	public static void main(String[] args) {

		// 1. Write a Java program to create a new array list, add some colors (string)
		// and print out the collection'
		ArrayList<String> color = new ArrayList<String>();
		color.add("red");
		color.add("blue");
		color.add("black");
		color.add("Yellow");

		System.out.println("------1 st program o/p -------");

		for (int colorIndex = 0; colorIndex < color.size(); colorIndex++) {
			System.out.println(color.get(colorIndex));
		}

		// 2. Write a Java program to insert an element into the array list at the
		// first and last positions.
		color.add(0, "newElemet0");
		color.add((color.size()), "lastElement");

		System.out.println("------2 st program o/p -------");
		for (int colorIndex = 0; colorIndex < color.size(); colorIndex++) {
			System.out.println(color.get(colorIndex));
		}

		// 3. Write a Java program to retrieve an element (at a specified index) from a
		// given array list.
		System.out.println("------3 st program o/p -------");

		System.out.println("Element at 2 nd Position is: " + color.get(1));
		System.out.println("Element at 4 nd Position is: " + color.get(3));

		// 4. Write a Java program to update specific array element by given element.
		System.out.println("------4 st program o/p -------");
		color.set(2, "red_updated");
		System.out.println("updated Element at 3 nd Position is: " + color.get(2));

		// 5. Write a Java program to remove the third element from a array list.
		System.out.println("------4 st program o/p -------");
		color.remove(3);
		for (int colorIndex = 0; colorIndex < color.size(); colorIndex++) {
			System.out.println(color.get(colorIndex));
		}

		// 6. Write a Java program to search an element in a array list.
		System.out.println("------6  st program o/p -------");
		System.out.println(color.contains("red"));
		System.out.println(color.contains("black"));

		// 7. Write a Java program to reverse elements in a array list
		System.out.println("------ 7 th program o/p -------");
		Collections.reverse(color);
		System.out.println("reverse list is " + color);
		for (int colorIndex = 0; colorIndex < color.size(); colorIndex++) {
			System.out.println(color.get(colorIndex));
		}

		// 8. Write a Java program to extract a portion of a array list.
		System.out.println("------ extract a portion of a array list  -------");
		System.out.println(color.subList(0, 2));

		// 9. Write a Java program of swap two elements in an array list.
		System.out.println("------ swap two element -------");
		Collections.swap(color, 1, 3);
		for (int colorIndex = 0; colorIndex < color.size(); colorIndex++) {
			System.out.println(color.get(colorIndex));
		}

		// 12. Write a Java program to print all the elements of a ArrayList using the
		// position of the elements

		System.out.println("----print all the elements of a ArrayList using the position of the elements");
		for (int colorIndex = 0; colorIndex < color.size(); colorIndex++) {
			System.out.println(color.get(colorIndex));
		}

		// 10. Write a Java program to empty an array list.
		System.out.println("------ clear array list-------");
		color.clear();
		System.out.println("clear filter " + color);

	}

}
