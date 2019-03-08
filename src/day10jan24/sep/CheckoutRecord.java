package day10jan24.sep;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {
	private List<CheckoutRecordEntry> checkoutEntryList;

	public CheckoutRecord() {
		this.checkoutEntryList = new ArrayList<CheckoutRecordEntry>();
	}

	public List<CheckoutRecordEntry> getCheckoutEntryList() {
		return checkoutEntryList;
	}

	public void addCheckoutEntry(CheckoutRecordEntry entry) {
		if (null == this.checkoutEntryList) {
			this.checkoutEntryList = new ArrayList<CheckoutRecordEntry>();
		}
		this.checkoutEntryList.add(entry);
	}
}
