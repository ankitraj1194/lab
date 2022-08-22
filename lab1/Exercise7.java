package lab1;
import java.util.*;
/*
 * Exercise 7: Create a method to check if a number is an increasing number
 *A number is said to be an increasing number if no digit is exceeded by the
 * digit to its left. For Example : 134468 is an increasing numbe

 */
public class Exercise7 {

	public static void main(String[] args) {
		boolean flag= m1();
		 if(flag){
	           System.out.println("Digits are not in increasing order.");
	       }else{
	           System.out.println("Digits are in increasing order.");
	       }
	}
	static boolean m1() {
	       int num;
	       boolean flag = false;
	       Scanner in = new Scanner(System.in);
	       System.out.println("Enter a number : ");
	       num = in.nextInt();
	       int currentDigit = num % 10;
	       num = num/10;
	       while(num>0){
	           if(currentDigit <= num % 10){
	               flag = true;
	               break;
	           }
	           currentDigit = num % 10;
	           num = num/10;
	       }
	      return flag;
	}
}
