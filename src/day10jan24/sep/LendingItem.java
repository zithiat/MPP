package day10jan24.sep;

public class LendingItem {
	private Integer numCopiesInLib;
	
	public LendingItem() {
	}

	public Integer getNumCopiesInLib() {
		return numCopiesInLib;
	}

	public void setNumCopiesInLib(Integer numCopiesInLib) {
		this.numCopiesInLib = numCopiesInLib;
	}
	
	public String getTitle() {
		return "";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + getTitle().hashCode();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LendingItem other = (LendingItem) obj;
		if (!getTitle().equals(other.getTitle()))
			return false;
		return true;
	}
}
