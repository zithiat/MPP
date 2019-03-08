package day11jan25.sep;

import java.util.ArrayList;
import java.util.List;

public class Conference {
	private String name;
	private double fullConferenceFee;

	private List<IAttendee> attendeeList;

	public Conference(String name, double fullFee) {
		this.name = name;
		this.fullConferenceFee = fullFee;
		this.attendeeList = new ArrayList<IAttendee>();
	}

	public String getName() {
		return name;
	}

	public double getFullFee() {
		return fullConferenceFee;
	}
	
	public void addAttendee(IAttendee attendee) {
		if (null == this.attendeeList) {
			this.attendeeList = new ArrayList<IAttendee>();
		}
		this.attendeeList.add(attendee);
	}

	public double getTotalPayments() {
		double total = 0.0;
		if (null != this.attendeeList) {
			for (IAttendee ia : attendeeList) {
				total += ia.getRegistrationFee();
			}
		}
		return total;
	}
}
