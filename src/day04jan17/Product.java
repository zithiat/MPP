package day04jan17;

public class Product implements IProduct {
	
	private String description;
	private String productNumber;
	private double price;
	private IComPoints comPoints;
	
	public Product(String description, String productNumber, double price) {
		this.description = description;
		this.productNumber = productNumber;
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public IComPoints getComPoints() {
		return comPoints;
	}

	public void setComPoints(IComPoints comPoints) {
		this.comPoints = comPoints;
	}

	@Override
	public String toString() {
		return "Product [description=" + description + ", productNumber=" + productNumber + ", price=" + price
				+ ", \t\t\t\ncomPoints=" + comPoints.getPoints() + "]";
	}
}
