package lab6;
/*
 * 
Exercise2 Collection: Create a method that accepts a character array and count
 the number of times each character is present in the array.

 */
import java.util.*;

public class Exercise2 {
	//method to count the frequency
	 static Map<Character,Integer> countChars(char[] arr) {
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(char ch:arr) {
			if(map.containsKey(ch)) {
				//increaseing count
				map.put(ch, map.get(ch)+1);
			}
			// storinf for first time 
			else {
				map.put(ch, 1);
			}
		}
		return map;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char arr[]=str.toCharArray();
		System.out.println(countChars(arr));
	}

	}
