package day06jan19.sep;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		double total = 0.0;
		if (null != list) {
			for (Employee e : list) {
				if (null != e) {
					total += e.computeUpdatedBalanceSum();
				}
			}
		}
		return total;
	}
}
