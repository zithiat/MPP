package day13jan28;

public interface IPerson {
	default void myDefault() {
		System.out.println("From default method.");
	}

	static void myStatic() {
		System.out.println("From my static.");
	}

	void myAbstract();
}
