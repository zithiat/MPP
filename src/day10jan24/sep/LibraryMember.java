package day10jan24.sep;

public class LibraryMember {
	private String memberId;
	private String firstName;
	private String lastName;
	private String phone;
	private CheckoutRecord checkoutRecord;

	public LibraryMember(String Id, String fName, String lName, String phone) {
		this.memberId = Id;
		this.firstName = fName;
		this.lastName = lName;
		this.phone = phone;
	}

	public String getMemberId() {
		return memberId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhone() {
		return phone;
	}

	public CheckoutRecord getCheckoutRecord() {
		return checkoutRecord;
	}

	public void setCheckoutRecord(CheckoutRecord cr) {
		this.checkoutRecord = cr;
	}
}
