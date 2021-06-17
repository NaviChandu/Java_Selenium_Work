package Constructor;

import java.util.ArrayList;

public class Car {

	String name;
	double price;
	String color;
	String modelName;

	public Car(String name, double price, String color, String modelName) {
		this.name = name;
		this.price = price;
		this.color = color;
		this.modelName = modelName;
	}
	
	public Car(String name){
		
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}

	public String getModelName() {
		return modelName;
	}

	public Car() {
		System.out.println("0 param const.");
	}

	public Car(int a) {
		System.out.println("1 param const.");
		System.out.println(a);
	}

	public Car(int a, int b) {
		System.out.println("2 params const.");
		System.out.println(a + " " + b);
	}

	public static void main(String[] args) {

		// Car c1 = new Car();
		// Car c2 = new Car(10);
		// Car c3 = new Car(10,20);

		Car c11 = new Car("BMW", 32.33, "Black", "320d");
		System.out.println(c11.name + " " + c11.price + " " + c11.color + " " + c11.modelName);

		System.out.println(c11.getName());
		System.out.println(c11.getColor());
		System.out.println(c11.getModelName());
		System.out.println(c11.getPrice());

		// Car c22 = new Car("Honda City", 15.20, "White", "ivtech");
		// System.out.println(c22.name + " " + c22.price + " " + c22.color + " "
		// + c22.modelName);

	}

}
