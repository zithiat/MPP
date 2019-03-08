package day13jan28;

import java.util.ArrayList;
import java.util.List;

public class Company {
	private String name;

	private List<Department> departments;

	public Company(String name) {
		this.name = name;
		departments = new ArrayList<Department>();
	}

	public void addDepartment(Department d) {
		if (departments != null) {
			departments.add(d);
		}
	}

	public String getName() {
		return name;
	}

	public List<Department> getDepartments() {
		return departments;
	}
	
	public void print() {
		System.out.println(this.toString());
		if (departments != null) {
			for (Department d : departments) {
				d.print();
			}
		}
	}
	
	public double getSalary() {
		double total = 0.0;
		if (departments != null) {
			for (Department d : departments) {
				System.out.println("Total salary of " + d.getName() + " is " + d.getSalary());
				total += d.getSalary();
			}
		}
		return total;
	}
	
	public void printReportingHierarchy() {
		if (departments != null) {
			for (Department d : departments) {
				d.printReportingHierarchy();
			}
		}
	}

	@Override
	public String toString() {
		return "Company [name=" + name + "]";
	}
}
