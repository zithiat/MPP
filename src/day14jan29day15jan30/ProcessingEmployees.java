package day14jan29day15jan30;

// Program 4: ProcessingEmployees.java
// Processing streams of Employee objects.
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessingEmployees {
	public static void main(String[] args) {
		// initialize array of Employees
		Employee[] employees = { new Employee("Jason", "Red", 5000, "IT"), new Employee("Ashley", "Green", 7600, "IT"),
				new Employee("Matthew", "Indigo", 3587.5, "Sales"),
				new Employee("James", "Indigo", 4700.77, "Marketing"), new Employee("Luke", "Indigo", 6200, "IT"),
				new Employee("Jason", "Blue", 3200, "Sales"), new Employee("Wendy", "Brown", 4236.4, "Marketing") };

		// get List view of the Employees
		List<Employee> list = Arrays.asList(employees);

		// display all Employees
		System.out.println("Complete Employee list:");
		list.stream().forEach(System.out::println); // A method reference.

		// To test Collectors.joining
		// Convert elements to strings and concatenate them, separated by commas
		String joined = list.stream().map(Object::toString) // this DOES go to the overridden method toString inside
															// Employee!! Yes!!
				// joining method needs Strings coming in.
				// .map(Employee::toString) // this also DOES work!! Yes!!
				.collect(Collectors.joining(", "));

		System.out.println("\n" + joined + "\n");
		Predicate<Employee> startWithB = n -> n.getLastName().startsWith("B");

		// Lab - homework
		// 1) Count the number of last names that begin with the letter ‘B’. Print out
		// this number.
		System.out.println("1) Count the number of last names that begin with the letter ‘B’: "
				+ list.stream().filter(startWithB).count() + "\n");

		// 2) Print out all of the Employee objects whose last name begins with the
		// letter ‘B’ in sorted order.
		System.out.println(
				"2) Print out all of the Employee objects whose last name begins with the letter ‘B’ in sorted order.");
		list.stream().filter(startWithB).sorted(Comparator.comparing(Employee::getLastName))
				.forEach(System.out::println);
		System.out.println();

		// 3) Print out all of the Employee objects whose last name begins with the
		// letter ‘B’ and change their first name and last name to be All capital
		// letters.
		System.out.println(
				"3)  Print out all of the Employee objects whose last name begins with the letter ‘B’ and change their first name and last name to be All capital letters.");
		List<Employee> filteredList = list.stream().filter(startWithB).collect(Collectors.toList());
		Consumer<Employee> upperCaseName = n -> {
			// Using setter will change the value of the original data in the list
			n.setFirstName(n.getFirstName().toUpperCase());
			n.setLastName(n.getLastName().toUpperCase());
			// just print
			System.out.println(n);
		};
		filteredList.stream().forEach(upperCaseName);
		System.out.println();

		// 4) Print out All of the employee objects, but if the last name begins with
		// the letter ‘B’, then capitalize all the letters in the last name
		// 4.1) Use the Collectors.joining method to print out All Employee objects.
		// (See my presentation file ‘Do_Last_This_Was_Lesson 9_Streams_E.docx’.)
		System.out.println("4.1) Use the  Collectors.joining  method to print out All Employee objects.");
		Predicate<Employee> notStartWithB = n -> !n.getLastName().startsWith("B");

		List<Employee> lastNameWithBEmployees = list.stream().filter(startWithB).collect(Collectors.toList());
		lastNameWithBEmployees.stream().peek(n -> n.setLastName(n.getLastName().toUpperCase()));

		List<Employee> lastNameNotBEmployees = list.stream().filter(notStartWithB).collect(Collectors.toList());

		Stream<Employee> combined = Stream.concat(lastNameNotBEmployees.stream(), lastNameWithBEmployees.stream());
		String joining = combined.map(n -> n.toString() + "|").collect(Collectors.joining());
		System.out.println(joining);
		System.out.println();

		// 4.2) Use the Collectors.joining method to print out All Employee objects, and
		// separate each one with a delimeter of “---\n---“
		System.out.println(
				"4.2) Use the  Collectors.joining  method to print out All Employee objects, and separate each one with a delimeter of “---\\n---“");
		System.out.println(Stream.concat(lastNameWithBEmployees.stream(), lastNameNotBEmployees.stream())
				.map(Employee::toString).collect(Collectors.joining("---\n---")));

		// 5) Print out all of the Employee objects’ last names, whose last name begins
		// with the letter ‘I’ in sorted order, and get rid of all the duplicates. Print
		// out only the last names
		System.out.println(
				"5)  Print out all of the Employee objects’ last names, whose last name begins with the letter ‘I’ in sorted order, and get rid of all the duplicates. Print out only the last names");
		Predicate<Employee> startWithI = n -> n.getLastName().startsWith("I");
		list.stream().filter(startWithI).map(Employee::getLastName).distinct().forEach(System.out::println);
		System.out.println();

		// 6) Print out the average of all the salaries
		System.out.println("6) Print out the average of all the salaries");
		System.out.println(
				String.format("$%,3.2f", list.stream().mapToDouble(Employee::getSalary).average().getAsDouble()));
		System.out.println();

		// 7) Use the ‘reduce’ method to print out the total salary of all employees
		System.out.println("7) Use the ‘reduce’ method to print out the total salary of all employees");
		System.out.println(
				String.format("$%,3.2f", list.stream().mapToDouble(Employee::getSalary).reduce(0, (x, y) -> x + y)));
		System.out.println();

		// 8) Print out only the first names of all the employees. Use the ‘map’ method
		// to accomplish this
		System.out.println(
				"8) Print out only the first names of all the employees. Use the ‘map’ method to accomplish this");
		list.stream().map(Employee::getFirstName).forEach(System.out::println);
		System.out.println();

		// 9) Create an infinite stream of even numbers (0, 2, 4, …) and then,
		// eventually print out only the first 20 even numbers from this stream
		System.out.println(
				"9) Create an infinite stream of even numbers (0, 2, 4, …) and then, eventually print out only the first 20 even numbers from this stream");
		Stream<Integer> infiniteStream = Stream.iterate(0, i -> i + 2);
		infiniteStream.limit(20).forEach(n -> System.out.print(n + " "));
		System.out.println();
		System.out.println();
		
		// 3) Implement  a method with the following signature and return type: public int countWords(List<String> words, char c, char d, int len)
		System.out.println("3) Implement  a method with the following signature and return type: public int countWords(List<String> words, char c, char d, int len)");
		String[] strs = {"abcd", "defgh", "kdksoa", "dhjq1s", "3dcaga" , "ac23"};
		List<String> words = Arrays.asList(strs);
		System.out.println(countWords(words, 'd', 'c', 6)); // should be 2: "kdksoa" and "dhjq1s"
		System.out.println(countWords(words, 'c', 'd', 4)); // should be 1: "ac23"

	} // end main
	
	
	/*
	 * To count the number of words in the input list words that have length equal to len, 
	 * that contain the character c, and that do not contain the character d. 
	 * Create a solution that uses a lambda expression.  
	 */
	public static int countWords(List<String> words, char c, char d, int len) {
		return (int) words.stream().filter(w -> w.length() == len).filter(w -> w.contains(c + "")).filter(w -> !w.contains(d + "")).count();
	}

} // end class ProcessingEmployees
