package InheritanceConcept;

public class TestCar {
	public static void main(String[] args) {

		BMW b = new BMW();

		b.start();
		// BMW start method will be called
		// which class method to call, the complier decides at run time

		// inherit from Car calls
		b.stop();
		b.refuel();
		b.thefSafety();
		b.engine();

		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();

		// we cannot call c.thefsafety(), since its only available in bMW
		// Parent cannot inherit.

		// *************************
		// Top casting
		// *****************

		Car c1 = new BMW(); // without reference
		// Car will give a name to this object
		// car as a parent will give the name

		// child class object can be referred by parent class reference variable

		c1.start();
		// it will call BMW method
		c1.stop();
		c1.refuel();
		// c1.thef is not there because
		// Java will create security layer and hide from access theftsecuirty method.
		// only BMW can access theft safety method.
		// its some other becauses has parent of BMW cannot access theft safety.

		// object of CAR (parent object) is created.
		// PARENT IS NOT giving rerence name
		// BMW -child gives the reference name

		// BMW b1 = new Car(); gives error so u need to type casting

		// down casting
		// BMW b1 = (BMW) new Car();

		// class Cast Exception: OOP1: car cannot be cast to BMW.
		// downcasting is not posisble in JAVA

		// b1.start();
		// b1.stop();
		// b1.thefSafety();
		// b1.refuel();

		Vehicle v1 = new BMW();
		v1.engine();
		// v1. start or stop is not available

	}

}
