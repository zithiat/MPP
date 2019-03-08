package day07jan21;

import java.util.Calendar;
import java.util.Date;

public class DateRange {
	private Calendar startDate;
	private Calendar endDate;

	public DateRange(Calendar startDate, Calendar endDate) {
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public boolean isInRange(Date date) {
		if (date.after(startDate.getTime()) && date.before(endDate.getTime()))
			return true;
		return false;
	}

	public static Date getFirstDayOfMonth(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));
		return cal.getTime();
	}

	public static Date getLastDayOfMonth(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		return cal.getTime();
	}

	@Override
	public String toString() {
		return "DateRange [startDate=" + startDate.getTime() + ", endDate=" + endDate.getTime() + "]";
	}

	public Calendar getStartDate() {
		return startDate;
	}

	public Calendar getEndDate() {
		return endDate;
	}
}
