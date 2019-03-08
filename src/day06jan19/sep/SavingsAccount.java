package day06jan19.sep;

public class SavingsAccount extends Account {
	private double balance;
	private double interestRate;
	private String accountId;

	public SavingsAccount(String accountId, double interestRate, double startBalance) {
		this.balance = startBalance;
		this.interestRate = interestRate;
		this.accountId = accountId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	@Override
	double computeUpdatedBalance() {
		return this.balance = balance + (interestRate * balance);
	}

	@Override
	public String toString() {
		return "SavingsAccount [balance=" + balance + ", interestRate=" + interestRate + ", accountId=" + accountId
				+ "]";
	}
}
