package day03jan16;

public class UPS implements ICarrier {
	/*
	 * Rate = $0.45 * number of pounds.
	 */
	public double getQuote(double weight) {
		return 0.45 * weight;
	}
}
