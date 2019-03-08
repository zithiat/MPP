package day07jan21;

import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {
	private double commission = 0.07;
	private double baseSalary;
	private List<Order> orders;
	
	public Commissioned(double baseSalary) {
		this.baseSalary = baseSalary;
		this.orders = new ArrayList<Order>();
	}
	
	public Commissioned(double commission, double baseSalary) {
		this.commission = commission;
		this.baseSalary = baseSalary;
	}

	public Commissioned(double commission, double baseSalary, List<Order> orders) {
		this.commission = commission;
		this.baseSalary = baseSalary;
		this.orders = new ArrayList<Order>();
		this.orders.addAll(orders);
	}
	
	public void addOrders(Order o) {
		if (null != this.orders) {
			this.orders.add(o);
		}
	}

	@Override
	public double calcGrossPay(DateRange dr) {
		double total = 0.0;
		if (null != this.orders) {
			for (Order o : this.orders) {
				if (dr.isInRange(o.getOrderDate())) {
					total += commission * o.getOrderAmount();
				}
			}
		}
		return total + baseSalary;
	}

	@Override
	public String toString() {
		return "Employee=" + this.getEmpId() + ", Commissioned [" + "name=" + this.getEmpId() + ", commission=" + commission + ", baseSalary=" + baseSalary + "]";
	}
}
