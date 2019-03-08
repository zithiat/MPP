package day07jan21;

public class Paycheck {
	private double grossPay;
	private double fica = 0.23;
	private double state = 0.05;
	private double local = 0.01;
	private double medicare = 0.03;
	private double socialSecurity = 0.075;
	private DateRange payPeriod;

	public Paycheck() {
	}

	public Paycheck(double grossPay) {
		this.grossPay = grossPay;
	}

	public Paycheck(double grossPay, DateRange payPeriod) {
		this.grossPay = grossPay;
		this.payPeriod = payPeriod;
	}

	public Paycheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity,
			DateRange payPeriod) {
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
		this.payPeriod = payPeriod;
	}

	public double getGrossPay() {
		return grossPay;
	}

	public double getFica() {
		return fica;
	}

	public double getState() {
		return state;
	}

	public double getLocal() {
		return local;
	}

	public double getMedicare() {
		return medicare;
	}

	public double getSocialSecurity() {
		return socialSecurity;
	}

	public DateRange getPayPeriod() {
		return payPeriod;
	}

	public void print() {
		System.out.println(this.toString());
	}

	public double getNetPay() {
		// We need to check the payperiod if it's more than a month,
		// however, for this simple practice, we will count as 1 month instead.
		return grossPay * (1 - (fica + state + local + medicare + socialSecurity));
	}

	@Override
	public String toString() {
		return "- Paycheck [grossPay=" + grossPay + ", fica=" + fica + ", state=" + state + ", local=" + local
				+ ", medicare=" + medicare + ", socialSecurity=" + socialSecurity
				+ ", getNetPay()=" + getNetPay() 
				+ ", payPeriod="+ payPeriod.getStartDate().getTime() + "-" + payPeriod.getEndDate().getTime() + "]";
	}
}
