package day02jan15;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Application {

	public static void main(String[] args) throws ParseException {
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy"); // to format the birthdate

		Company com = new Company("My Company");

		// Add two departments to the company
		Department salesDept = new Department("Sales Department", "New York");
		Department manuDept = new Department("Manufacture Department", "Texas");
		com.addDepartment(salesDept);
		com.addDepartment(manuDept);

		// Add 3 positions to departments
		Position salesMan = new Position("Sale Manager 1", "Sales Manager of Sales Department");
		Position salesMember1 = new Position("Sale Member 1", "Sales Member 1 of Sales Department");
		Position salesMember2 = new Position("Sale Member 2", "Sales Member 2 of Sales Department");
		salesDept.addPosition(salesMan);
		salesDept.addPosition(salesMember1);
		salesDept.addPosition(salesMember2);

		Position manuHead = new Position("Manufacture Manager", "Manufacture Manager of Manufacture Department");
		Position worker1 = new Position("Manufacture Member 1", "Worker 1 of Manufacture Department");
		Position worker2 = new Position("Manufacture Member 2", "Worker 2 of Manufacture Department");
		manuDept.addPosition(manuHead);
		manuDept.addPosition(worker1);
		manuDept.addPosition(worker2);

		// Add 5 employees, 3 in manufacture, 2 in sales
		Employee johnSmith = new Employee("111", "John", "H", "Smith", df.parse("12-11-1972"), "111-22-3333", 5000);
		Employee helenSword = new Employee("112", "Helen", "K", "Sword", df.parse("02-08-1968"), "111-22-4444", 7000);
		Employee davidThoo = new Employee("113", "David", "W", "Thoo", df.parse("19-02-1971"), "111-22-5555", 5500);
		manuHead.setEmployee(helenSword);
		worker1.setEmployee(johnSmith); 
		worker2.setEmployee(davidThoo);
		
		worker1.setSuperior(manuHead);
		worker2.setSuperior(manuHead);
		manuHead.assignInferior(worker1);
		manuHead.assignInferior(worker2);

		Employee kenGogle = new Employee("114", "Ken", "M", "Gogle", df.parse("21-08-1976"), "111-22-6666", 6500);
		Employee maryDale = new Employee("115", "Mary", "G", "Dale", df.parse("19-02-1979"), "111-22-7777", 5500);
		salesMan.setEmployee(kenGogle);
		salesMember1.setEmployee(maryDale);
		salesMember1.setSuperior(salesMan);
		salesMan.assignInferior(salesMember1);
		
		Department mgmtDept = new Department("Management Board", "New York");
		com.addDepartment(mgmtDept);
		Position executive = new Position("CEO", "Top Executive");
		mgmtDept.addPosition(executive);
		Employee lyleThorn = new Employee("110", "Lyle", "B", "Thorn", df.parse("12-02-1964"), "111-22-1111", 9000);
		executive.setEmployee(lyleThorn);
		
		Position salesHead = new Position("Sale Head", "Sales Head of Sales Department");
		Position salesMan2 = new Position("Sale Manager 2", "Sales Manager 2 of Sales Department");
		Position salesMember3 = new Position("Sale Member 3", "Sales Member 3 of Sales Department");
		Position salesMember4 = new Position("Sale Member 4", "Sales Member 4 of Sales Department");
		salesDept.addPosition(salesHead);
		salesDept.addPosition(salesMan2);
		salesDept.addPosition(salesMember3);
		salesDept.addPosition(salesMember4);
		
		Employee tomHarley = new Employee("116", "Tom", "H", "Harley", df.parse("19-02-1971"), "111-22-5555", 6500);
		Employee sueStandford = new Employee("117", "Sue", "T", "Standford", df.parse("19-02-1973"), "111-44-5235", 5500);
		Employee marcCambridge = new Employee("118", "Marc", "K", "Cambridge", df.parse("19-02-1978"), "111-33-5425", 5500);
		Employee ronWork = new Employee("119", "Ron", "W", "Work", df.parse("19-02-1971"), "111-32-0923", 7500);
		salesHead.setEmployee(ronWork);
		salesMan2.setEmployee(tomHarley);
		salesMember3.setEmployee(sueStandford);
		salesMember4.setEmployee(marcCambridge);
		
		salesMember3.setSuperior(salesMan2);
		salesMember4.setSuperior(salesMan2);
		salesMan2.assignInferior(salesMember3);
		salesMan2.assignInferior(salesMember4);
		
		salesMan.setSuperior(salesHead);
		salesMan2.setSuperior(salesHead);
		salesHead.assignInferior(salesMan);
		salesHead.assignInferior(salesMan2);
		
		salesHead.setSuperior(executive);
		manuHead.setSuperior(executive);
		
		executive.assignInferior(salesHead);
		executive.assignInferior(manuHead);
		
		com.print();
		com.printAverageSalary();
		System.out.println();
		com.printMaxSalary();
		System.out.println("\n======================\n");
		System.out.println("Total salary of " + com.getName() + " is " + String.format("$%,3.2f", com.getSalary()));
		System.out.println("\n======================\n");
		com.printReportingHierarchy();
	}
}
