package day09jan23;

public class Admin {
	private Department[] depts = new Department[3];

	public Admin(Department[] depts) {
		this.depts = depts;
	}
	
	public String hourlyCompanyMessage() {
		StringBuffer sb = new StringBuffer();
		if (null != this.depts) {
			for (Department d : this.depts) {
				sb.append(format(d.getName(), d.nextMessage()));
			}
		}
		return sb.toString();
	}
	
	public String format(String name, String msg) {
		return name + ": " + msg + "\n";
	}
}
