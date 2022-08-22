package lab6;
/*
 * Exercise 3: Create a method which accepts an array of numbers and returns the
 *  numbers and their squares in Hashmap
 */
import java.util.*;
public class Exercise3 {
	//squRING FUNCTION
	Map<Integer, Integer> getSquares(int[] array) 
	{
		HashMap<Integer,Integer> square = new HashMap<>();// NEW HASHMAP
		for(int i=0;i<array.length;i++) 
		{
			// squaring and putting value and using key as original number
			square.put(array[i], (array[i]*array[i]));
		}
		return square;
		
	}

	public static void main(String[] args) {
		
		System.out.println("Enter size of array: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); 
		int [] arr=new int[n];
		System.out.println("Enter elements of array: ");
		for(int i=0;i<n;i++) 
		{
			arr[i]=sc.nextInt();
		}
		Exercise3 ex3= new Exercise3(); // making object
		System.out.println("square of each elements are"+"\n"+ex3.getSquares(arr));
			}

}
