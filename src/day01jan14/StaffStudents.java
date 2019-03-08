package day01jan14;

import java.util.ArrayList;

public class StaffStudents extends Person {	
	private double gpa;
	private ArrayList<Course> courses;

	public StaffStudents(String name, String phone, int age, double salary, double gpa) {
		super(name, phone, age, salary);
		this.gpa = gpa;
		this.courses = new ArrayList<Course>();
	}

	public void addCourse(Course c) {
		if (this.courses != null) {
			this.courses.add(c);
		}
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
}
