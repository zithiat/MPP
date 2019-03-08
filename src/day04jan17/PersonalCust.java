package day04jan17;

public class PersonalCust extends ACustomer {

	private String creditRating;
	private String creditCard;

	public PersonalCust(String name, String address, String phone) {
		super(name, address, phone);
	}

	public String getCreditRating() {
		return creditRating;
	}

	public void setCreditRating(String creditRating) {
		this.creditRating = creditRating;
	}

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}
}
