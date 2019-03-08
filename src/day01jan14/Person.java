package day01jan14;

import java.util.ArrayList;

public class Person {
	private String name;
	private String phone;
	private int age;
	private double salary;
	private ArrayList<Course> courses;

	public Person(String name, String phone, int age) {
		this.name = name;
		this.phone = phone;
		this.age = age;
	}

	public Person(String name, String phone, int age, double salary) {
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.salary = salary;
	}
	
	public void addCourse(Course c) {
		
	}
	
	public ArrayList<Course> getCourses() {
		return courses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		//return "Person [name=" + name + ", phone=" + phone + ", age=" + age + ", salary=" + salary + "]";
		return "name=" + name + ", phone=" + phone + ", age=" + age;
	}
}
