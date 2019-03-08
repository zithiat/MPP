package day01jan14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DepartmentApplication {

	public static void main(String[] args) throws IOException {
		Department dept = new Department("ComputerScience");

		// Create faculty objects
		Person frankMoore = new Faculty("Frank Moore", "472-5921", 43, 10000);
		Person samHoward = new Faculty("Sam Howard", "472-7222", 55, 9500);
		Person johnDoodle = new Faculty("John Doodle", "472-6190", 39, 8600);
		dept.addPerson(frankMoore);
		dept.addPerson(samHoward);
		dept.addPerson(johnDoodle);

		// Create student objects
		Person johnDoe = new Student("John Doe", "472-1121", 22, 4.0);
		Person maryJones = new Student("Mary Jones", "472-7322", 32, 3.80);
		Person leeJohnson = new Student("Lee Johnson", "472-6009", 19, 3.65);
		dept.addPerson(johnDoe);
		dept.addPerson(maryJones);
		dept.addPerson(leeJohnson);

		// Create staff objects
		Person frankGore = new Staff("Frank Gore", "472-3321", 33, 4050);
		Person adamDavis = new Staff("Adam Davis", "472-7552", 50, 5500);
		Person davidHeck = new Staff("David Heck", "472-8890", 29, 3600);
		dept.addPerson(frankGore);
		dept.addPerson(adamDavis);
		dept.addPerson(davidHeck);
		
		// Create staffstudent objects
		Person mikeHamstring = new StaffStudents("Mike Hamstring", "123-1111", 12, 4000, 3.5);
		Person bobMiller = new StaffStudents("Bob Miller", "123-2222", 13, 4500, 3.8);
		Person ryanSmith = new StaffStudents("Ryan Smith", "123-3333", 14, 5000, 4.0);
		dept.addPerson(mikeHamstring);
		dept.addPerson(bobMiller);
		dept.addPerson(ryanSmith);
		
		Course cs201 = new Course("cs201", "programming", 4, johnDoodle);
		Course cs360 = new Course("cs360", "database", 3, samHoward);
		Course cs404 = new Course("cs404", "compiler", 4, johnDoodle);
		Course cs240 = new Course("cs240", "datastructure", 2, johnDoodle);
		Course cs301 = new Course("cs301", "Software engg", 3, samHoward);
		Course cs450 = new Course("cs450", "Advanced architecture", 5, frankMoore);
		
		
		// Assign courses to faculties
		frankMoore.addCourse(cs450);
		
		johnDoodle.addCourse(cs201);
		johnDoodle.addCourse(cs404);
		johnDoodle.addCourse(cs240);
		
		samHoward.addCourse(cs360);
		samHoward.addCourse(cs301);

		// Assign courses to students
		johnDoe.addCourse(cs201);
		johnDoe.addCourse(cs360);
		johnDoe.addCourse(cs404);
		johnDoe.addCourse(cs301);
		
		maryJones.addCourse(cs201);
		maryJones.addCourse(cs404);
		maryJones.addCourse(cs450);
		
		leeJohnson.addCourse(cs201);
		leeJohnson.addCourse(cs360);
		leeJohnson.addCourse(cs240);
		leeJohnson.addCourse(cs450);
		
		mikeHamstring.addCourse(cs240);
		mikeHamstring.addCourse(cs450);
		
		bobMiller.addCourse(cs301);
		bobMiller.addCourse(cs201);
		
		ryanSmith.addCourse(cs360);
		ryanSmith.addCourse(cs404);
		
		while (true) {
			putText("Enter first letter of ");
			putText("getTotalSalary, showAllMembers, unitsPerFaculty, printStudentsOfTheCourse or quit : ");
			int choice = getChar();
			switch (choice) {
			case 'g':
				putText("Total sum of all salaries is:");
				putText(String.format("$%,3.2f", dept.getTotalSalary()) + "\n");
				break;
			case 's':
				dept.showAllMembers();
				break;
			case 'u':
				dept.unitsPerFaculty();
				break;
			case 'q':
				return;
			case 'p':
				dept.printStudentsOfTheCourse();
				break;
			default:
				putText("Invalid entry\n");
			} // end switch
		} // end while
	} // end main()

	public static void putText(String s) // writes string s to the screen
	{
		System.out.println(s);
	}

	// -------------------------------------------------------------
	public static String getString() throws IOException // reads a string from the keyboard input
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}

	// -------------------------------------------------------------
	public static char getChar() throws IOException // reads a character from the keyboard input
	{
		String s = getString();
		return s.charAt(0);
	}

	// -------------------------------------------------------------
	public static int getInt() throws IOException // reads an integers from the keyboard input
	{
		String s = getString();
		return Integer.parseInt(s);
	}
	// -------------------------------------------------------------
} // end class