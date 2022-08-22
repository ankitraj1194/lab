package lab1;

import java.util.*;

public class Exercise1 {

	public static void main(String[] args) {
		Exercise1 a = new Exercise1();
		a.m1();

	}

	void m1() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = 0;
		while (n != 0) {
			sum = sum + (int) Math.pow(n % 10, 3);
			n = n / 10;
		}
		System.out.println(sum);
		in.close();
	}
}
