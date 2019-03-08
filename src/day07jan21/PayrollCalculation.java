package day07jan21;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class PayrollCalculation {

	public static void main(String[] args) throws ParseException {
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		Employee e1 = new Hourly(25, 35);
		e1.setEmpId("John Steward");
		
		Employee e2 = new Salaried(4500);
		e2.setEmpId("Harry Pottred");
		
		Commissioned c = new Commissioned(1500);
		Order o1 = new Order("1111", df.parse("21-01-2018"), 3250);
		Order o2 = new Order("2222", df.parse("11-02-2018"), 3550);
		Order o3 = new Order("3333", df.parse("18-03-2018"), 3750);
		Order o4 = new Order("4444", df.parse("23-03-2018"), 4750);
		c.addOrders(o1);
		c.addOrders(o2);
		c.addOrders(o3);
		c.addOrders(o4);
		Employee e3 = c;
		e3.setEmpId("David Hufferpuff");
		
		Paycheck p1 = e1.calcCompensation(2, 2018);
		e1.addPaycheck(p1);
		
		Paycheck p2 = e2.calcCompensation(2, 2018);
		e2.addPaycheck(p2);
		
		Paycheck p3 = e3.calcCompensation(0, 2018);
		Paycheck p4 = e3.calcCompensation(1, 2018);
		Paycheck p5 =e3.calcCompensation(2, 2018);
		e3.addPaycheck(p3);
		e3.addPaycheck(p4);
		e3.addPaycheck(p5);
		
		List<Employee> empls = new ArrayList<Employee>();
		empls.add(e1);
		empls.add(e2);
		empls.add(e3);
		for (Employee e: empls) {
			e.print();
		}
	}
}
