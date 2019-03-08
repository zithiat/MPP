package day03jan16;

public class Package {
	private String description;
	private double weight;
	private String zone;
	private double lowestCost;
	private String deliveredBy;
	private String sender;

	public Package(String description, double weight, String zone) {
		this.description = description;
		this.weight = weight;
		this.zone = zone;
	}

	public void setLowestCost(double lowestCost) {
		if (null == this.sender || this.sender.equals("")) {
			this.lowestCost = lowestCost;
		} else {
			if (this.sender.equals("student")) { // student gets 10% discount
				this.lowestCost = lowestCost * 0.9;
			} else if (this.sender.equals("senior")) { // senior (65 years and above) gets 15% discount
				this.lowestCost = lowestCost * 0.85;
			} else {
				this.lowestCost = lowestCost;
			}
		}
	}

	public String getDescription() {
		return description;
	}

	public double getWeight() {
		return weight;
	}

	public String getZone() {
		return zone;
	}

	public double getLowestCost() {
		return lowestCost;
	}

	public String getDeliveredBy() {
		return deliveredBy;
	}

	public void setDeliveredBy(String deliveredBy) {
		this.deliveredBy = deliveredBy;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}
}
