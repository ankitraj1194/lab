package lab3;
/*
 * 
Exercise 1: Write a Java program that reads a line of integers and then
displays each integer and the sum of all integers. 

 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise1 {

	public static void main(String[] args) {
		int sum=0,n;
		Scanner in =new Scanner(System.in);
		System.out.println("enter numbers with spaces");
		String str = in.nextLine();
		 StringTokenizer st = new StringTokenizer(str," ");
		  while (st.hasMoreTokens()) {  
			  n= Integer.parseInt(st.nextToken());
			  sum=sum+n;
		         System.out.print(n);
		     }  
		  
		  System.out.println("\nsum = "+sum);
		  }

}
