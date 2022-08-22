package lab1;
//Check if the input is a power of two. 
//Ex: 8 is a power of 2 

import java.util.Scanner;

public class Exercise8 {
	static boolean isPowerOfTwo(int n)
	{
	    if(n==0)
	    return false;
	 
	return (int)(Math.ceil((Math.log(n) / Math.log(2)))) ==
	       (int)(Math.floor(((Math.log(n) / Math.log(2)))));
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=s.nextInt();
		boolean flag= isPowerOfTwo(n);
		 if(flag){
	           System.out.println("yes, a power of 2");
	       }else{
	           System.out.println("no, not a power of 2");
	       }
	}

}
