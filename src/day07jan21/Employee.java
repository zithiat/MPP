package day07jan21;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public abstract class Employee {
	private String empId;
	private List<Paycheck> pcs;

	public abstract double calcGrossPay(DateRange dr);

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public List<Paycheck> getPcs() {
		return pcs;
	}

	public void print() {
		System.out.println(this.toString());
		if (null != this.pcs) {
			for(Paycheck p : pcs) {
				p.print();
			}
		}
		System.out.println();
	}
	
	public void addPaycheck(Paycheck pc) {
		if (null == this.pcs) {
			this.pcs = new ArrayList<Paycheck>();
		}
		this.pcs.add(pc);
	}

	public Paycheck calcCompensation(int month, int year) {
		Calendar tmpDate = new GregorianCalendar(year, month, 1);
		Date startDate = DateRange.getFirstDayOfMonth(tmpDate.getTime());
		Date endDate = DateRange.getLastDayOfMonth(tmpDate.getTime());
		Calendar sDate = Calendar.getInstance();
		sDate.setTime(startDate);
		Calendar eDate = Calendar.getInstance();
		eDate.setTime(endDate);
		DateRange dr = new DateRange(sDate, eDate);
		
		double grossPay = this.calcGrossPay(dr);
		
		return new Paycheck(grossPay, dr);
	}
}
