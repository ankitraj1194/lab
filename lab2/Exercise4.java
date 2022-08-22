package lab2;
/*
 * Exercise 4: Create a method which accepts an integer array and removes 
 * the duplicates in the array. Return the resulting array in descending order
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Exercise4 {
  void fun() {
		Scanner in = new Scanner(System.in);
		System.out.println("input no. of elements");
		int n = in.nextInt();
		System.out.println("input elements");
		//storing in linked hash set because it dosenot allow duplicate value 
		LinkedHashSet<Integer> set = new LinkedHashSet<>(n);
		 for(int i=0;i<n;i++) {
			set.add(in.nextInt());
			}
		 //converting linkedHashSet(as idk how to reverse a linkedHashSet) to array list 
		 ArrayList list = new ArrayList(set);
		 Collections.sort(list, Collections.reverseOrder());
	        System.out.println(list); 
  }
	public static void main(String[] args) {
			Exercise4 a =new Exercise4();
			a.fun();
	}

}
