package day03jan16;

public class FedEx implements ICarrier {

	private String zone;

	public FedEx(String zone) {
		this.zone = zone;
	}

	/*
	 * Total cost in dollars = zone * number of pounds where zone is specified as
	 * follows: Zone = 0.35 for IA, MT, OR and CA Zone = 0.30 for TX, and UT Zone =
	 * 0.55 for FL, MA and OH Zone = 0.43 for all others
	 */
	@Override
	public double getQuote(double weight) {
		double rate = 0.43;
		switch (zone) {
		case "IA":
		case "MT":
		case "OR":
		case "CA":
			rate = 0.35;
			break;
		case "TX":
		case "UT":
			rate = 0.30;
			break;
		case "FL":
		case "MA":
		case "OH":
			rate = 0.55;
			break;
		default:
			break;
		}
		return rate * weight;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}
}
