package day11jan25.sep;

public class Premium extends Session {
	private String name;
	private double fee;

	public Premium(String name, double fee) {
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
