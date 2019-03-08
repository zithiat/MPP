package day11jan25.sep;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		Conference conf = new Conference("Java 2002:  Into the Future", 4000);
		
		IAttendee fAttendee = new FullAttendee("Joe Coder", "1000 HiTech Blvd, Pleasantville, IA", conf.getFullFee());
		
		Session regular = new Session("How to Do Less and Accomplish More through Abstraction", 750);
		Session premium = new Premium("The 3 Amigos Explain All", 1200);
		Session workshop = new Workshop("FOOP for Managers", 450);
		
		List<Session> sessionList = new ArrayList<Session>();
		sessionList.add(regular);
		sessionList.add(premium);
		sessionList.add(workshop);
		IAttendee sAttendee = new SelectiveAttendee("John Management", "200 Greenstreet, New York, NY", sessionList);
		
		conf.addAttendee(fAttendee);
		conf.addAttendee(sAttendee);
		
		System.out.println(conf.getTotalPayments());
	}

}
