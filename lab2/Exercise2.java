package lab2;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Exercise 2: Create a method that can accept an array of String objects 
 * and sort in alphabetical order. The elements in the left half should be 
 * completely in uppercase and the elements in the right half should be 
 * completely in lower case. Return the resulting array.
Note: If there are odd number of String objects, then (n/2) +1 elements
 should be in UPPPERCASE

 */
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("input no. of elements");
		int n = in.nextInt();
		String[] strArray = new String[n];
		System.out.println("input element");
		for(int i=0;i<n;i++) {
			strArray[i]=in.next();
		}
		Arrays.sort(strArray);
		for (int i=0;i<n;i++) {
			if(i<=n/2)
			strArray[i]=strArray[i].toUpperCase();
			else
			strArray[i]=strArray[i].toLowerCase();
		}
		System.out.println(Arrays.toString(strArray));
		}	
		
	}
