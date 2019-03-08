package day11jan25.sep;

import java.util.ArrayList;
import java.util.List;

public class SelectiveAttendee extends AAttendee {
	
	private List<Session> sessions;

	public SelectiveAttendee(String name, String address, List<Session> sessions) {
		super(name, address);
		this.sessions = sessions;
	}

	@Override
	public double getRegistrationFee() {
		double total = 0.0;
		if (null != this.sessions) {
			for (Session s : sessions) {
				total += s.getSessionFee();
			}
		}
		return total;
	}

	public List<Session> getSessions() {
		return sessions;
	}
	
	public void addSession(Session s) {
		if (null == this.sessions)
			this.sessions = new ArrayList<Session>();
		this.sessions.add(s);
	}

}
