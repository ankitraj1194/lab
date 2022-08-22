package lab3;
/*
 * Exercise 9: Create a method to accept date and print the duration in days, 
months and 
 * years with regards to current system date.
 */

import java.util.Scanner;

public class Exercise9 {
     static void  fun(){
    	 Scanner in =new Scanner(System.in);
 		System.out.println("enter date in dd-mm-yyy format");
 		String date= new String(in.nextLine());
 		//SPLITING DATE STRING IN STRING ARRAY
    	 String[] dateParts = date.split("-");
  
         String day = dateParts[0];
         String month = dateParts[1];
         String year = dateParts[2];
  
         // Printing the day, month, and year
         System.out.println("Day: " + day);
         System.out.println("Month: " + month);
         System.out.println("Year: " + year);
      }
	public static void main(String[] args) {
			fun();
	}

}
