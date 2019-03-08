package day02jan15;

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
//			for (Position p : positions) {
//				p.print();
//			}
			positions.stream().forEach(Position::print);
		}
		System.out.println();
	}
	
	public double getSalary() {
		double total = 0.0;
		if (positions != null) {
//			for (Position p : positions) {
//				total += p.getSalary();
//			}
			total = positions.stream().mapToDouble(Position::getSalary).sum();
		}
		return total;
	}
	
	public double getAverageSalary() {
		double ave = 0.0;
		if (positions != null) {
			ave = positions.stream().mapToDouble(Position::getSalary).average().getAsDouble();
		}
		return ave;
	}
	
	public double getMaxSalary() {
		double max = 0.0;
		if (positions != null) {
			max = positions.stream().mapToDouble(Position::getSalary).max().getAsDouble();
		}
		return max;
	}
	
	public void printReportingHierarchy() {
		System.out.println(this.toString());
		if (positions != null) {
//			for (Position p : positions) {
//				p.printDownLine();
//			}
			positions.stream().forEach(Position::printDownLine);
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
}
