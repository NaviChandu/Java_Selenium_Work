package InheritanceAssignemnt;

public class NYU extends University {

	@Override
	public void regularClasses() {
		System.out.println("NYU -- Regular trainings");
	}

	@Override
	public void eveningClasses() {
		System.out.println("NYU -- Evening trainings");
	}

	public void specialSessions() {
		System.out.println("NYU -- specialSessions");
	}

	public void PHDCourse() {
		System.out.println("NYU -- PHD Course");
	}

	public void DualDegreeCourse() {
		System.out.println("NYU -- DualDegreeCourse");
	}
}
