package lab1;
/*
 Exercise 6: Create a class with a method to find the difference between
  the sum of the squares and the square of the sum of the first n natural
   numbers.
 */
import java.util.Scanner;

public class Exercise6 {
	static int SquareDiff(int n){		 
		int l, k, m;
		    // Sum of the squares of the first n natural numbers is
		    l = (n * (n + 1) * (2 * n + 1)) / 6;		     
		    // Sum of n naturals numbers
		    k = (n * (n + 1)) / 2;		 
		    // Square of k
		    k = k * k;		     
		    // Differences between l and k
		    m = Math.abs(l - k);		     
		    return m;
		}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		 System.out.println(SquareDiff(n)); 
	}

}
