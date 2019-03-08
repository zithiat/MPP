package day13jan28;

public final class MyImmutable {

	private final String name;
	
	private final String address;
	
	public MyImmutable(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
}
