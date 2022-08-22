package lab5;

import java.util.Scanner;

/*
Write a Java Program to validate the full name of an employee. Create and throw 
a user defined exception if firstName and lastName is blank
*/
class NameException extends Exception{
  public NameException() {
	  super("name can not be empty");
  }
}

public class Exercise2 {
	
public	static void validate() throws NameException {
		Scanner in = new Scanner(System.in);
		System.out.println("give the frist and last name");
		String name = in.nextLine(); // taking age input
		if (name.length()==0) {
			throw new NameException(); // throwing exception
		} else {
			System.out.println("good to go ");
		}
	}
	public static void main(String[] args) {
		
		try {
			validate();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
