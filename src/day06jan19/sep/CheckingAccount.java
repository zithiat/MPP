package day06jan19.sep;

public class CheckingAccount extends Account {
	private double balance;
	private double monthlyFee;
	private String accountId;

	public CheckingAccount(String accountId, double monthlyFee, double startBalance) {
		this.balance = startBalance;
		this.monthlyFee = monthlyFee;
		this.accountId = accountId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getMonthlyFee() {
		return monthlyFee;
	}

	public void setMonthlyFee(double monthlyFee) {
		this.monthlyFee = monthlyFee;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	@Override
	double computeUpdatedBalance() {
		return this.balance = balance - monthlyFee;
	}

	@Override
	public String toString() {
		return "CheckingAccount [balance=" + balance + ", monthlyFee=" + monthlyFee + ", accountId=" + accountId + "]";
	}
}
