package day11jan25.sep;

public abstract class AAttendee implements IAttendee {
	private String name;
	private String address;
	
	public AAttendee(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public abstract double getRegistrationFee();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
