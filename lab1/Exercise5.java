package lab1;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		function(n);
	}
	static void function(int n){
		int sum=0,count=0,i=1;;
		while(count<n) {
			if(i%3==0 || i%5==0) {
			sum=sum+i;
			count++;
			}
			i++;
		}
		System.out.println("sum="+sum);
	}
}
