package JavaPart1Assignments;

public class MethodsRadiousOfCircle {
	
	public static void main(String[] args) {
	
		
		MethodsRadiousOfCircle radiusOfCirlce = new MethodsRadiousOfCircle();
		
		float radius = 1.2f;
		
		double rad = radiusOfCirlce.radiusOfCircle(radius);
		System.out.println("Radius of circle is: "+ rad);	
		
	}
	
	public double radiusOfCircle(double radius) {
		return (Math.PI* (radius*radius));
	}
}
