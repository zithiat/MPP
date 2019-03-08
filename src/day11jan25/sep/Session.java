package day11jan25.sep;

public class Session {
	private String name;
	private double fee;
	
	public Session() {
	}

	public Session(String name, double fee) {
		this.name = name;
		this.fee = fee;
	}

	public double getSessionFee() {
		return this.fee;
	}
}
