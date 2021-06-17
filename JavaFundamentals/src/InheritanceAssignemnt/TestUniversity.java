package InheritanceAssignemnt;

public class TestUniversity {
	public static void main(String[] args) {
		// try to created object of child class and call overridden methods
		Stanford stf = new Stanford();
		stf.regularClasses();
		stf.eveningClasses();
		stf.playGround();
		stf.DualDegreeCourse();
		stf.PHDCourse();
		stf.specialSessions();

		MIT mit = new MIT();
		mit.regularClasses();
		mit.eveningClasses();
		mit.playGround();

		NYU nyu = new NYU();
		nyu.eveningClasses();
		nyu.eveningClasses();
		nyu.playGround();

		University university = new University();
		university.regularClasses();
		university.classroom();
		university.playGround();
		university.eveningClasses();

		System.out.println("--Top Casting--");
		// top casting
		University uni = new MIT();
		uni.classroom();
		uni.eveningClasses();
		uni.playGround();
		uni.regularClasses();

		System.out.println("--Down Casting--");

		MIT m1 = (MIT) new University();

	}

}
