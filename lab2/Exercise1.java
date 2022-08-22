package lab2;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Exercise 1: Create a method which accepts an array of integer elements 
 * and return the second smallest element in the array
 * Sort the array and return the second smallest element in the array 
 */
public class Exercise1 {
	
	 static int getSecondSmallest(int[] a, int total){  
		Arrays.sort(a);  
		return a[1];  
		}  
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");  
		int n=sc.nextInt();  
		int[] array = new int[n];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{   
		array[i]=sc.nextInt();  
		}  
		System.out.println("Second smallest: "+getSecondSmallest(array,n));
	}

}
