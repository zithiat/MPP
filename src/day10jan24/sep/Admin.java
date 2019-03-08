package day10jan24.sep;

import java.util.*;

public class Admin {
	// Returns phone numbers (in sorted order) of the Library Members who have ever
	// checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		List<String> phoneNums = new ArrayList<String>();
		// implement
		for (LibraryMember m : members) {
			List<CheckoutRecordEntry> entryList = m.getCheckoutRecord().getCheckoutEntryList();
			for (CheckoutRecordEntry e : entryList) {
				LendingItem li = e.getLendingItem();
				if (li.equals(item)) {
					phoneNums.add(m.getPhone());
					break;
				}
			}
		}
		return phoneNums;
	}
}
