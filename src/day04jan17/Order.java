package day04jan17;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	
	private String orderNumber;
	private boolean prepaid = false;
	private double orderPrice;
	private Date orderDate;
	private String status;
	private List<Orderline> orderlines;
	private ICustomer customer;
	
	public Order(String orderNumber, Date orderDate) {
		this.orderNumber = orderNumber;
		this.orderDate = orderDate;
		orderlines = new ArrayList<Orderline>();
	}

	public double getTotalPrice() {
		if (null != orderlines) {
			for (Orderline ol : orderlines) {
				orderPrice += ol.computePrice();
			}
		}
		double totalPoints = 0.0;
		if (null != orderlines) {
			for (Orderline ol : orderlines) {
				totalPoints += ol.computePoints();
			}
		}
		if (getCustomerPoints() >= 25) {
			orderPrice = orderPrice * (1 - 0.4); // discount 40%
		}
		setCustomerPoints((totalPoints + getCustomerPoints()) - 25);
		return orderPrice;
	}
	
	public boolean getPrepaid() {
		return prepaid;
	}
	
	public double getCustomerPoints() {
		return ((ACustomer) customer).getPoints();
	}
	
	public double getOrderPoints() {
		return 0.0;
	}
	
	public void setCustomerPoints(double points) {
		if (null != customer) {
			((ACustomer) customer).setPoints(points);
		}
	}
	
	public void addOrderline(Orderline o) {
		if (null != orderlines) {
			orderlines.add(o);
		}
	}

	public double getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public List<Orderline> getOrderlines() {
		return orderlines;
	}

	public void setPrepaid(boolean prepaid) {
		this.prepaid = prepaid;
	}

	public ICustomer getCustomer() {
		return customer;
	}

	public void setCustomer(ICustomer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Order [orderNumber=" + orderNumber + ", prepaid=" + prepaid + ", orderPrice=" + orderPrice
				+ ", orderDate=" + orderDate + ", status=" + status + ",\t\norderlines=" + orderlines + ",\t\ncustomer="
				+ customer + "]";
	}
}
