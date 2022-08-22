package lab3;
/*
 * Exercise 2: Create a class containing a method to create the mirror image of a String. The method 
 * should return the two Strings separated with a pipe(|) symbol .
 */
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("enter line");
		StringBuffer str = new StringBuffer( in.nextLine());
		StringBuffer str2 = new StringBuffer( str);
		str.reverse();
	  System.out.println(str2 +"|"+ str);
	}

}
