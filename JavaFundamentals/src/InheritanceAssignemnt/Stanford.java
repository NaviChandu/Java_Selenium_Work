package InheritanceAssignemnt;

public class Stanford extends University {

	@Override
	public void regularClasses() {
		System.out.println("Stanford -- Regular trainings");
	}

	@Override
	public void eveningClasses() {
		System.out.println("Stanford -- Evening trainings");
	}

	public void specialSessions() {
		System.out.println("Stanford -- specialSessions");
	}

	public void PHDCourse() {
		System.out.println("Stanford -- PHD Course");
	}

	public void DualDegreeCourse() {
		System.out.println("Stanford -- DualDegreeCourse");
	}

}
