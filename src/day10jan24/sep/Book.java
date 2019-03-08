package day10jan24.sep;

public class Book extends LendingItem {
	private String isbn;
	private String title;
	private String authorFirstName;
	private String authorLastName;

	public Book(String isbn, String title, String fName, String lName) {
		this.isbn = isbn;
		this.title = title;
		this.authorFirstName = fName;
		this.authorLastName = lName;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthorFirstName() {
		return authorFirstName;
	}

	public String getAuthorLastName() {
		return authorLastName;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", authorFirstName=" + authorFirstName + ", authorLastName="
				+ authorLastName + "]";
	}
}
