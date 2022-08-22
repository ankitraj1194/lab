package lab3;
/*
 * Exercise 8: Create a method that accepts a String and checks if it is a positive string.
 *  A string is considered a positive string, if on moving from left to right 
 * each character in the String comes after the previous characters in the Alphabetical order. 
 */
import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("enter line");
		String str= new String(in.nextLine());
		
		// length of the string
        int n = str.length();
        for (int i = 0; i < n-1; i++) {
           if( str.charAt(i) > str.charAt(i+1)) {
        	   System.out.println("not increasing");
        	   return;
        }
        }
        System.out.println("increasing");
	}
}

