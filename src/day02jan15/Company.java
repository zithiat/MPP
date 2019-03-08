package day02jan15;

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
//			for (Department d : departments) {
//				d.print();
//			}
			departments.stream().forEach(Department::print);
		}
	}
	
	public double getSalary() {
		double total = 0.0;
		if (departments != null) {
//			for (Department d : departments) {
////				System.out.println("Total salary of " + d.getName() + " is " + d.getSalary());
//				total += d.getSalary();
//			}
			total = departments.stream().mapToDouble(Department::getSalary).sum();
		}
		return total;
	}
	
	public void printAverageSalary() {
		if (departments != null) {
			departments.stream().forEach(n -> System.out.println(String.format("Average salary of %s: $%,3.2f", n.getName(), n.getAverageSalary())));
		}
	}
	
	public void printMaxSalary() {
		if (departments != null) {
			departments.stream().forEach(n -> System.out.println(String.format("Max salary of %s: $%,3.2f", n.getName(), n.getMaxSalary())));
		}
	}
	
	public void printReportingHierarchy() {
		if (departments != null) {
//			for (Department d : departments) {
//				d.printReportingHierarchy();
//			}
			departments.stream().forEach(Department::printReportingHierarchy);
		}
	}

	@Override
	public String toString() {
		return "Company [name=" + name + "]";
	}
}
