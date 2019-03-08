package day03jan16;

public class USMail implements ICarrier {
	/*
	 * If the weight is less than 3 pound, then the cost is $1.00.
	 * If the weight is larger than 3 pounds, then the cost is $0.55 per pound.
	 */
	public double getQuote(double weight) {
		return (weight <= 3) ? 1 * weight : 0.55 * weight;
	}
}
