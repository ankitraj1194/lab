package lab5;

/*
 * Exercise 1:  Validate the age of a person and display proper message by using 
 * user defined exception. Age of a person should be above 15.
 */
import java.util.*;

// customized exception class
class AgeException extends Exception {
	AgeException() {
		super("invalid age"); // exception message
	}
}

public class Exercise1 {

public	static void validateAge() throws AgeException {

		Scanner in = new Scanner(System.in);
		System.out.println("give the age");
		int age = in.nextInt(); // taking age input
		if (age < 15) {
			throw new AgeException(); // throwing exception
		} else {
			System.out.println("valid age");
		}

	}

	public static void main(String[] args) {
		try {
			validateAge(); // calling validate method
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}