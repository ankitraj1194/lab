package lab3;
/*
 * 
Exercise 4: Create a method that accepts a number and modifies it such that the
 each of the digit in the newly formed number is equal to the difference between
  two consecutive digits in the original number. The digit in the units place can
   be left as it is. 
Note: Take the absolute value of the difference. Ex: 6-8 = 2

Accept a number and modify it such that the each of the digit in the newly formed number is equal to the difference between two consecutive digits in the original number. 
For example. 
Input: 45862 
Output:13242 
Algorithm: 
• Convert number into String 
• Extract each char using charAt method 
• Convert char to int and find the difference 
• Create new StringBuffer object and keep adding the difference 
• Finally convert StringBuffer to int 

 */

import java.util.Scanner;

public class Exercise4 {
	static int modifyNumber(String n) {
		int i;
		// Create new StringBuffer object and keep adding the absolute difference
		StringBuffer result = new StringBuffer();
		for (i = 0; i < n.length() - 1; i++) {
			result.append(Math.abs(n.charAt(i) - n.charAt(i + 1)));
		}
		// The digit in the units place can be left as it is.
		result.append(n.charAt(i));
		// Finally convert StringBuffer to int
		int r = Integer.parseInt(result.toString());
		return r;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter number");
		// taking integer value as string
		String n = in.next();
		System.out.println(modifyNumber(n));
	}

}
