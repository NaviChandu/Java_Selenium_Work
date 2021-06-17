package InheritanceAssignemnt;

public class MIT extends University {

	@Override
	public void regularClasses() {
		System.out.println("MIT -- Regular trainings");
	}

	@Override
	public void eveningClasses() {
		System.out.println("MIT -- Evening trainings");
	}

	public void specialSessions() {
		System.out.println("MIT -- specialSessions");
	}

	public void PHDCourse() {
		System.out.println("MIT -- PHD Course");
	}

	public void DualDegreeCourse() {
		System.out.println("MIT -- DualDegreeCourse");
	}

}
