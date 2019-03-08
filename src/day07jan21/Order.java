package day07jan21;

import java.util.Date;

public class Order {
	private String orderNo;
	private Date orderDate;
	private double orderAmount;

	public Order(String orderNo, Date orderDate, double orderAmount) {
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	@Override
	public String toString() {
		return "\n\t\tOrder [orderNo=" + orderNo + ", orderDate=" + orderDate + ", orderAmount=" + orderAmount + "]";
	}
}
