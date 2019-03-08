package day07jan21;

public class Salaried extends Employee {
	private double salary;

	public Salaried(double salary) {
		this.salary = salary;
	}

	@Override
	public double calcGrossPay(DateRange dr) {
		return this.salary;
	}

	@Override
	public String toString() {
		return "Employee=" + this.getEmpId() + ", Salaried [salary=" + salary + "]";
	}
}
