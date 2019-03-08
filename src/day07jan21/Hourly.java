package day07jan21;

public class Hourly extends Employee {
	private double hourlyWage;
	private double hoursPerWeek;

	public Hourly(double hourlyWage, double hoursPerWeek) {
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}

	@Override
	public double calcGrossPay(DateRange dr) {
		return this.hourlyWage * this.hoursPerWeek;
	}

	@Override
	public String toString() {
		return "Employee=" + this.getEmpId() + ", Hourly [" + ", hourlyWage=" + hourlyWage + ", hoursPerWeek=" + hoursPerWeek + "]";
	}
}
