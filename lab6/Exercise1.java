/*
 * Exercise 1: Create a method which accepts a hash map and return the values
 *  of the map in sorted order as a List.
 */
package lab6;
import java.util.*;
public class Exercise1 {
    // function to sort hashmap by 
	static List  getValues(HashMap<Integer,Integer> map) {
			List<Integer> store = new ArrayList<>();//making new list 
			for (int n : map.values())  {
				store.add(n); //putting valuesw in list form hashmap
			}
				Collections.sort(store);  //sorting
				return store;
		}
    public static void main(String[] args)
    {
    	HashMap<Integer,Integer> map=new HashMap<>();
		map.put(1, 388);
		map.put(2, 579);
		map.put(3, 359);
		map.put(4, 350);
		map.put(5, 35);
		Exercise1 e1= new Exercise1();
		System.out.println(e1.getValues(map));
    }

}
