package lab1;

/*
 * Exercise 3: The Fibonacci sequence is defined by the following rule.
 *  The first 2 values in the sequence are 1, 1. Every subsequent value is
 *   the sum of the 2 values preceding it. Write a Java program that uses both
 *    recursive and non-recursive functions to print the nth value of the 
 *    Fibonacci sequence?
 */
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		System.out.println("from recurcuion F(" + n + ") = " + fib(n));
		System.out.println("from non-recurcuion F(" + n + ") = " + fib2(n));
	}

	static int fib(int n) {
		if (n <= 1) {
			return n;
		}

		return fib(n - 1) + fib(n - 2);
	}

	static int fib2(int n) {
		if (n <= 1) {
			return n;
		}

		int previousFib = 0, currentFib = 1;
		for (int i = 0; i < n - 1; i++) {
			int newFib = previousFib + currentFib;
			previousFib = currentFib;
			currentFib = newFib;
		}

		return currentFib;
	}
}