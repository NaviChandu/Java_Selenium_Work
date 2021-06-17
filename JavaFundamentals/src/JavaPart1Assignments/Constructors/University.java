package JavaPart1Assignments.Constructors;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class University {

	String name;
	String country;
	String stablishedDate;
	ArrayList<String> courseList = new ArrayList<String>();

	public String getName() {
		return name;
	}

	public String getCountry() {
		return country;
	}

	public String getstablishedDate() {
		return stablishedDate;
	}

	public ArrayList<String> getcourseList() {
		return courseList;
	}

	public University() {
		System.out.println("Default constructor");
	}

	public University(String name, String country, String stablishedDate, ArrayList<String> courseList) {
		this.name = name;
		this.country = country;
		this.stablishedDate = stablishedDate;
		this.courseList = courseList;
	}

	public University(String name, String country, ArrayList<String> courseList) {
		this.name = name;
		this.country = country;
		this.courseList = courseList;
	}

	public University(ArrayList<String> courseList) {
		this.courseList = courseList;
	}

	public static void main(String[] args) {

		// Create a Array Lis
		ArrayList<String> courses = new ArrayList<String>();
		courses.add("EC");
		courses.add("CS");
		courses.add("IS");

		String pattern = "2001-01-02";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());

		University uniOnj = new University("VTU", "India", date, courses);
		System.out.println("-----constructor with all parameters-----");
		System.out.println(uniOnj.name);
		System.out.println(uniOnj.country);
		System.out.println(uniOnj.stablishedDate);
		System.out.println(uniOnj.courseList);

		ArrayList<String> coursesUk = new ArrayList<String>();
		coursesUk.add("Core Java");
		coursesUk.add("Selenium");
		coursesUk.add("Web Services");

		University uniOnj3 = new University("Amity", "UK", coursesUk);

		System.out.println("-----constructor 3 parameters and print using getMethod-----");
		System.out.println(uniOnj3.getName());
		System.out.println(uniOnj3.getCountry());
		System.out.println(uniOnj3.getcourseList());

		ArrayList<String> CourseListOnly = new ArrayList<String>();
		CourseListOnly.add("Java");
		CourseListOnly.add("Selenium");
		CourseListOnly.add("Python");
		CourseListOnly.add("ML");
		CourseListOnly.add("AI");

		University uniOnj1 = new University(CourseListOnly);
		System.out.println("-----constructor single parameters-----");
		System.out.println(uniOnj1.getcourseList());

	}

}
