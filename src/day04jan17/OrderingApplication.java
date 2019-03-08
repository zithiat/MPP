package day04jan17;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class OrderingApplication {
	
	private List<ICustomer> customers;

	public static void main(String[] args) throws ParseException {
		OrderingApplication oa = new OrderingApplication();
		oa.createCustomersList();
		oa.createOrdersByCustomers();
	}
	
	public void createCustomersList() {
		this.customers = new ArrayList<ICustomer>();
		
		// 3 Corporate customers
		ICustomer corp1 = new CorporateCust("Applet Ltd", "123 1st St, New York, NY", "111-333-5555");
//		ICustomer corp2 = new CorporateCust("Servlet Ltd", "321 2nd St, Fairfield, IA", "222-444-6666");
//		ICustomer corp3 = new CorporateCust("Cloudlet Ltd", "999 101st St, Dallas, TX", "999-888-7777");
		this.customers.add(corp1);
//		this.customers.add(corp2);
//		this.customers.add(corp3);
//		
//		// 2 Personal customers
//		ICustomer perso1 = new PersonalCust("Adam Smith", "11 North St, Ottumwa, IA", "641-421-2321");
//		ICustomer perso2 = new PersonalCust("John Thompson", "30 South St, Miami, FL", "821-442-8237");		
//		this.customers.add(perso1);
//		this.customers.add(perso2);
	}
	
	public void createOrdersByCustomers() throws ParseException {
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		Order oCorp1 = new Order("111-1111", df.parse("12-11-2018"));
//		Order oCorp2 = new Order("111-2222", df.parse("13-01-2019"));
//		Order oCorp3 = new Order("111-3333", df.parse("11-08-2018"));
//		Order oPerso1 = new Order("222-1111", df.parse("02-02-2018"));
//		Order oPerso2 = new Order("222-2222", df.parse("19-07-2018"));
		
		oCorp1.setCustomer(customers.get(0));
//		oCorp2.setCustomer(customers.get(1));
//		oCorp3.setCustomer(customers.get(2));
//		oPerso1.setCustomer(customers.get(3));
//		oPerso2.setCustomer(customers.get(4));
		
		Orderline olCorp11 = new Orderline(10, "ordered", df.parse("13-11-2018"));
		Orderline olCorp12 = new Orderline(20, "ordered", df.parse("13-11-2018"));
		Product pd1 = new Product("Computer", "1111", 500);
		Product pd2 = new Product("Massage machine", "1122", 1000);
		pd1.setComPoints(new ComputerPoints());
		pd2.setComPoints(new HealthPoints());
		olCorp11.setProduct(pd1);
		olCorp12.setProduct(pd2);
		
		oCorp1.addOrderline(olCorp11);
		oCorp1.addOrderline(olCorp12);
		
		oCorp1.setCustomerPoints(olCorp11.computePoints());
		oCorp1.setOrderPrice(oCorp1.getTotalPrice());
		
		System.out.println(oCorp1);
	}
}
