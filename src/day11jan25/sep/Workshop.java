package day11jan25.sep;

public class Workshop extends Session {
	private String name;
	private double fee;

	public Workshop(String name, double fee) {
		super();
		this.name = name;
		this.fee = fee;
	}

	public String getName() {
		return name;
	}

	public double getSessionFee() {
		return fee;
	}
}
