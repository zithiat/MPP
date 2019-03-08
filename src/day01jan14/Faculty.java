package day01jan14;

import java.util.ArrayList;

public class Faculty extends Person {
	private ArrayList<Course> courses;
	
	public Faculty(String name, String phone, int age, double salary) {
		super(name, phone, age, salary);
		this.courses = new ArrayList<Course>();
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	
	public void addCourse(Course c) {
		this.courses.add(c);
	}
}
