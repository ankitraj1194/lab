package com.cg.eis.exception;

import java.util.Scanner;

/*Create an Exception class named as “EmployeeException”(User defined Exception) in
 *  a package named as “com.cg.eis.exception” and throw an exception if salary of
 *   an employee is below than 3000. 
 */
class EmployeeException extends Exception {
	EmployeeException() {
		super("salary of an employee can't be below than 3000.  ");
	}
}

public class Lab5Exercise3 {
public	static void validateSalary() throws EmployeeException {

		Scanner in = new Scanner(System.in);
		System.out.println("give the salary");
		int salary = in.nextInt(); // taking age input
		if (salary < 3000) {
			throw new EmployeeException(); // throwing exception
		} else {
			System.out.println("no error");
		}

	}

	public static void main(String[] args) {
		try {
			validateSalary(); // calling validate method
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
