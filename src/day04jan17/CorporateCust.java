package day04jan17;

public class CorporateCust extends ACustomer {

	private String creditRating;
	private double creditLimit;

	public CorporateCust(String name, String address, String phone) {
		super(name, address, phone);
	}
	
	public void generateMonthlyBills() {
		
	}

	public String getCreditRating() {
		return creditRating;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

	public void setCreditRating(String creditRating) {
		this.creditRating = creditRating;
	}
}
