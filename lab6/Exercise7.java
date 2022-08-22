package lab6;
import java.util.*;
/*
 * Exercise 7: Create a method which accepts an integer array, reverse the numbers 
 * in the array and returns the resulting array in sorted order
 */
public class Exercise7 {
	int[] getSorted(int[] arr) 
	{
		int [] reverseArr= new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			StringBuffer str = new StringBuffer( String.valueOf(arr[i]));
			str.reverse();
			String res=str.toString();
			int n=Integer.parseInt(res);
			reverseArr[i]=n;
			
		}
		 Arrays.sort(reverseArr);
		 return reverseArr;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("number of elements");
		int n = sc.nextInt();
		int [] arr=new int[n];
		for(int i =0;i<n;i++) {
		arr[i]=sc.nextInt();	
		}
		Exercise7 e=new Exercise7();
		int [] reverseArr=new int[n];
		reverseArr=e.getSorted(arr);
		for(int i=0;i<n;i++)
		{
			System.out.print(reverseArr[i] +" ");
		}

	}
}
