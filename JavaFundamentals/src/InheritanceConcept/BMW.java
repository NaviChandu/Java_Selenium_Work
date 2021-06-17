package InheritanceConcept;

public class BMW extends Car {

	// car is superclass
	// BMW is child or sub class

	/**
	 * BMW Start Method
	 */

	// method Overridding: when we have same method with same number of paramters in
	// parent class as well as in child class
	// method overloading: with in same class (multiple methods with diff
	// oarameters)
	// override: override from parent

	// override is also called Palymorhism.
	// run time or dynamic

	// Static methods can be over riddent
	// but static methods can be overload

	@Override
	public void start() {
		System.out.println("BMW -- Start");
	}

	/**
	 * BMW thefSafert
	 */

	public void thefSafety() {
		System.out.println("BMW - thefSafety");
	}

}
