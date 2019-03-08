package day10jan24.sep;

public class CD extends LendingItem {
	private String productId;
	private String title;
	private String company;

	public CD(String productId, String title, String company) {
		this.productId = productId;
		this.title = title;
		this.company = company;
	}

	public String getProductId() {
		return productId;
	}

	public String getTitle() {
		return title;
	}

	public String getCompany() {
		return company;
	}

	@Override
	public String toString() {
		return "CD [productId=" + productId + ", title=" + title + ", company=" + company + "]";
	}
}
