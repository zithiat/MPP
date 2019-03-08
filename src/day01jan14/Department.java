package day01jan14;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Department {
	private String name;
	private ArrayList<Person> persons;

	public Department(String name) {
		this.name = name;
		persons = new ArrayList<Person>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addPerson(Person p) {
		this.persons.add(p);
	}

	public double getTotalSalary() {
		double total = 0.0;
		if (persons != null && !persons.isEmpty()) {
//			for (Person p : persons) {
//				total += p.getSalary();
//			}
			total = persons.stream().mapToDouble(Person::getSalary).sum();
		}
		return total;
	}

	public void showAllMembers() {
		if (persons != null && !persons.isEmpty()) {
			System.out.println("All members from " + name);
//			System.out.println("Java 7 and earliers");
//			for (Person p : persons) {
//				System.out.println(p.toString() + ", type=" + p.getClass().getSimpleName());
//			}
//			System.out.println("Using Lamda & Stream");
			persons.stream().forEach(p -> System.out.println(p.toString() + p.getClass().getSimpleName()));
		}
	}

	public void unitsPerFaculty() {
		if (persons != null && !persons.isEmpty()) {
			System.out.println("Units per Faculty:");
//			System.out.println("Java 7 and earliers");
//			for (Person p : persons) {
//				if (p instanceof Faculty) { // or p.getClass().getSimpleName().equals("Faculty")
//					Faculty f = (Faculty) p;
//					int totalUnit = 0;
//					for(Course c : f.getCourses()) {
//						totalUnit += c.getUnits();
//					}
//					System.out.println(f.toString() + ", units=" + totalUnit);
//				}
//			}
//			System.out.println("Using Lamda & Stream");
			persons.stream().filter(Faculty.class::isInstance).forEach(n -> {
				System.out.println(n.toString() + ", units:" + n.getCourses().stream().mapToInt(u -> u.getUnits()).sum());
			});
		}
	}
	
	public void printStudentsOfTheCourse() {
		if (persons != null && !persons.isEmpty()) {
			System.out.println("Print all students with assigned courses from the department, included StaffStudents:");
//			System.out.println("Java 7 and earliers");
//			for (Person p : persons) {
//				String n = p.getClass().getSimpleName();
//				if (n.equals("Student") || n.equals("StaffStudents")) {
//					if (p.getCourses() != null) {
//						System.out.print("Student=" + p.getName() + ", courses=[");
//						for (int i = 0; i < p.getCourses().size(); i++) {
//							System.out.print(p.getCourses().get(i).getNumber() + ((i < p.getCourses().size() - 1) ? ", " : "]"));
//						}
//						System.out.println();
//					}
//				}
//					
//			}
//			System.out.println("Using Lamda & Stream");
			Predicate<Person> clsFilter = n -> (n instanceof Student || n instanceof StaffStudents);
			persons.stream().filter(clsFilter).forEach(n -> {
				System.out.print("Student=" + n.getName() + ", courses=[");
				n.getCourses().stream().forEach(m -> {
					System.out.print(m.getNumber() + " ");
				});
				System.out.println("]");
			});
		}
	}
}
