package lab6;
/*
Ex4:school offers medals to the students of tenth based on the following criteria 
If(Marks>=90) : Gold 
If(Marks between 80 and 90) : Silver 
If(Marks between 70 and 80) : Bronze 
Note: Marks between 80 and 90 means marks>=80 and marks<90 
Write a function which accepts the marks of students as a Hashmap and return the
 details of the students eligible for the medals along with type of medal. 
The input Hashmap contains the student registration number as key and mark as value. 
The output Hashmap should contain the student registration number as key and the
 medal type as value.
*/
import java.util.*;
public class Exercise4 {
	// medal assigning function
	HashMap<Long, String> getStudents(HashMap<Long, Double> map) {
		// storing map values in set 
		Set<Map.Entry<Long, Double>> stu = map.entrySet();
		System.out.println("qualified students for medal with random registrain number");
		for (Map.Entry<Long, Double> it : stu) 
		{
			//getting qualified students
			if (it.getValue() >= 70) 
				System.out.println(it.getKey() +" - "+ it.getValue());
		}
		// creating a new map and assigning medals 
		HashMap<Long,String> newmap=new HashMap<>();
		for (Map.Entry<Long, Double> it : stu) 
		{
			if(it.getValue()>=90)
			{
				newmap.put(it.getKey(), "Gold");
			}
			else if(it.getValue()>=80 && it.getValue()<90) {
				newmap.put(it.getKey(), "Silver");
			}
			else if(it.getValue()>=70 && it.getValue()<90) {
				newmap.put(it.getKey(), "Bronze");
			}
			
		}
		return newmap;
		
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of student you want to fetch in ");
		int n = sc.nextInt();
		int up = 999;
	    // creating random number for registration number
		Random rand = new Random();
		//creating student hashmap for storing data 
		HashMap<Long, Double> students = new HashMap<>();
		//taking input for each student
		for (int i = 0; i < n; i++) {
			System.out.println("Enter marks of student " +(i+1));
			//storing marks of each student 
			double marks = sc.nextInt();
			//creating random number for registration number
			long rd = rand.nextInt(up);
			// putting key as random(registration no) and marks as value 
			students.put(rd, marks);
		}
		Exercise4 e = new Exercise4();
		System.out.println(e.getStudents(students));
	}
}
