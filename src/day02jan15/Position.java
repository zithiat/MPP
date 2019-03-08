package day02jan15;

import java.util.ArrayList;
import java.util.List;

public class Position {
	private String title;
	private String description;
	private Position superior;
	private List<Position> inferiors;

	private Employee employee;

	public Position(String title, String description) {
		this.title = title;
		this.description = description;
	}

	public Position(String title, String description, Employee employee) {
		this.title = title;
		this.description = description;
		this.employee = employee;
	}
	
	public void assignInferior(Position p) {
		if (null == this.inferiors)
			this.inferiors = new ArrayList<Position>();
		this.inferiors.add(p);
	}
	
	public void print() {
		if (employee != null) {
			System.out.println(this.toString());
			employee.print();
		}
	}
	
	public void printDownLine() {
		if (null != this.employee) {
			String empName = this.employee.getFirstName();
			if (null == this.superior) {
				System.out.println(empName + " is top executive");
			} else {
				if (null == this.inferiors) {
					System.out.println("- - " + empName + " works for " + this.superior.employee.getFirstName());
				} else if (null != this.superior.superior){
					System.out.println("- " + empName + " works for " + this.superior.employee.getFirstName());
				} else {
					System.out.println(empName + " is Dept. head");
				}
			}
		}
	}
	
	public double getSalary() {
		if (employee != null) {
			return employee.getSalary();
		}
		return 0.0;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Position getSuperior() {
		return superior;
	}

	public void setSuperior(Position superior) {
		this.superior = superior;
	}

	@Override
	public String toString() {
		return "- - Position [title=" + title + ", description=" + description + "]";
	}
}
