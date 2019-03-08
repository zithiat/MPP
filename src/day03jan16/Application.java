package day03jan16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class Application {

	public static void main(String[] args) throws NumberFormatException, IOException {
		List<Package> packages;
		StringBuffer sb;
		while (true) {
			putText("Enter first letter of addPackages or quit : ");
			int choice = getChar();
			switch (choice) {
			case 'a':
				putText("Add number of packages:");
				int n = getInt();
				packages = new ArrayList<Package>();
				sb = new StringBuffer();
				for (int i = 0; i < n; i++) {
					putText("Name of package:");
					String name = getString();
					putText("Weight of package:");
					double weight = getDouble();
					putText("Zone to deliver:");
					String zone = getString();
					putText("Who is sending: (student / senior)");
					String sender = getString();
					Package p = new Package(name, weight, zone);
					packages.add(p);
					
					ICarrier[] iCarriers = {new FedEx(zone), new UPS(), new USMail() };
					// Utilize the sort ability of SortedMap based on the calculated cost
					SortedMap<Double, String> quoteList = new TreeMap<Double, String>();
					for (int j = 0; j < iCarriers.length; j++) {
						quoteList.put(iCarriers[i].getQuote(weight), iCarriers[i].getClass().getSimpleName());
					}
					
					p.setSender(sender);
					p.setLowestCost(quoteList.firstKey());
					p.setDeliveredBy(quoteList.get(quoteList.firstKey()));
					// debug purpose
					 System.out.println(quoteList);
					sb.append(String.format("%-20s", name)
							+ String.format("%-10s", String.format("$%.2f", p.getLowestCost()))
							+ String.format("%-10s", p.getDeliveredBy()) + "\n");
				}
				System.out.println(sb);
				break;
			case 'q':
				return;
			default:
				putText("Invalid entry\n");
			} // end switch
		} // end while
	}

	public static double getDouble() throws IOException // reads an double from the keyboard input
	{
		String s = getString();
		return (Double.valueOf(s)).doubleValue();
	}
	
	public static void putText(String s) // writes string s to the screen
	{
		System.out.println(s);
	}

	public static String getString() throws IOException // reads a string from the keyboard input
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
	
	public static int getInt() throws NumberFormatException, IOException  // reads an integers from the keyboard input
	{
		String s = getString();
		return Integer.parseInt(s);
	}
	
	public static char getChar() throws IOException // reads a character from the keyboard input
	{
		String s = getString();
		return s.charAt(0);
	}
}
