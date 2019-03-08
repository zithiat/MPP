package day10jan24.sep;

import java.time.LocalDate;

public class CheckoutRecordEntry {
	private LocalDate checkoutDate;
	private LocalDate dueDate;

	private LendingItem lendingItem;
	
	private ItemType lendingItemType;
	
	public CheckoutRecordEntry(LendingItem item, LocalDate chDate, LocalDate dueDate, ItemType type) {
		this.checkoutDate = chDate;
		this.dueDate = dueDate;
		this.lendingItem = item;
		this.lendingItemType = type;
	}

	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public LendingItem getLendingItem() {
		return lendingItem;
	}

	public ItemType getLendingItemType() {
		return lendingItemType;
	}
}
