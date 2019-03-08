package day06jan19.sep;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private List<Account> accounts;

	public Employee(String name) {
		this.name = name;
		this.accounts = new ArrayList<Account>();
	}

	public double computeUpdatedBalanceSum() {
		double total = 0.0;
		if (null != this.accounts) {
			for (Account a : this.accounts) {
				if (null != a) {
					total += a.computeUpdatedBalance();
				}
			}
		}
		return total;
	}

	public void addAccount(Account acct) {
		if (null != accounts) {
			this.accounts.add(acct);
		}
	}

	public String getName() {
		return name;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", accounts=" + accounts + "]";
	}
}
