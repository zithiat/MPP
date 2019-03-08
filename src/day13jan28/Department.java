package day13jan28;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String name;
	private String location;

	private List<Position> positions;

	public Department(String name, String location) {
		this.name = name;
		this.location = location;
		positions = new ArrayList<Position>();
	}
	
	public void print() {
		System.out.println(this.toString());
		if (positions != null) {
			for (Position p : positions) {
				p.print();
			}
		}
		System.out.println();
	}
	
	public double getSalary() {
		double total = 0.0;
		if (positions != null) {
			for (Position p : positions) {
				total += p.getSalary();
			}
		}
		return total;
	}
	
	public void printReportingHierarchy() {
		System.out.println(this.toString());
		if (positions != null) {
			for (Position p : positions) {
				p.printDownLine();
			}
		}
	}

	public void addPosition(Position p) {
		if (positions != null) {
			positions.add(p);
		}
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public List<Position> getPositions() {
		return positions;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", location=" + location + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((positions == null) ? 0 : positions.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (positions == null) {
			if (other.positions != null)
				return false;
		} else if (!positions.equals(other.positions))
			return false;
		return true;
	}
}
