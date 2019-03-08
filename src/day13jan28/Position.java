package day13jan28;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((employee == null) ? 0 : employee.hashCode());
		result = prime * result + ((inferiors == null) ? 0 : inferiors.hashCode());
		result = prime * result + ((superior == null) ? 0 : superior.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Position))
			return false;
		Position other = (Position) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (employee == null) {
			if (other.employee != null)
				return false;
		} else if (!employee.equals(other.employee))
			return false;
		if (inferiors == null) {
			if (other.inferiors != null)
				return false;
		} else if (!inferiors.equals(other.inferiors))
			return false;
		if (superior == null) {
			if (other.superior != null)
				return false;
		} else if (!superior.equals(other.superior))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Position newObj = new Position(title, description, employee);
		return newObj;
	}
}
