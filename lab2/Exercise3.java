package lab2;
/*
Exercise 3: Create a method which accepts an integer array, reverse 
the numbers in the array and returns the resulting array in sorted order
Accept and integer array, reverse the numbers in the array, sort it and 
return the resulting array. 
Hint 
Convert the numbers to String to reverse it 


*/
import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("input no. of elements");
		int n = in.nextInt();
		int[] arr = new int[n];
	  for(int i=0;i<n;i++) {
		arr[i]=in.nextInt();
		StringBuffer str = new StringBuffer(String.valueOf(arr[i]));
		str.reverse();
        arr[i] = Integer.parseInt(String.valueOf(str));
		}
	  Arrays.sort(arr);
	  System.out.println(Arrays.toString(arr));
	}
	}
