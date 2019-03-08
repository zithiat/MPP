package day11jan25.sep;

public class FullAttendee extends AAttendee {
	private double registrationFee;

	public FullAttendee(String name, String address, double registrationFee) {
		super(name, address);
		this.registrationFee = registrationFee;
	}

	public double getRegistrationFee() {
		return registrationFee;
	}

}
