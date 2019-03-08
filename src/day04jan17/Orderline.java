package day04jan17;

import java.util.Date;

public class Orderline {
	
	private int quantity;
	private double price;
	private String status;
	private Date shipDate;
	private double points;
	private IProduct product;
	
	public Orderline(int quantity, String status, Date shipDate) {
		this.quantity = quantity;
		this.status = status;
		this.shipDate = shipDate;
	}
	
	public double computePrice() {
		if (null != product) {
			price = ((Product) product).getPrice();
		}
		return price;
	}
	
	public double computePoints() {
		if (null != product) {
			points = ((Product) product).getComPoints().getPoints();
		}
		return points;
	}

	public IProduct getProduct() {
		return product;
	}

	public void setProduct(IProduct product) {
		this.product = product;
	}

	public double getPrice() {
		return price;
	}

	public double getPoints() {
		return points;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getShipDate() {
		return shipDate;
	}

	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}

	@Override
	public String toString() {
		return "Orderline [quantity=" + quantity + ", price=" + price + ", status=" + status + ", shipDate=" + shipDate
				+ ", points=" + points + ", \t\t\nproduct=" + product + "]";
	}
}
