package lab6;
/*
Exercise 6: Create a method which accepts the id and the age of people as a Map and
decide if they are eligible for vote. A person is eligible for vote if his age is
 greater than 18. Add the IDs of all the eligible persons to list and return the
 list. 
 */
import java.util.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
public class Exercise6 {
	
	List<Long> votersList(Map<Long, String> map) {
		ArrayList<Long> arl = new ArrayList<>();
		LocalDate now = LocalDate.now();
		String currentdate = now.toString();

		Set<Map.Entry<Long, String>> s = map.entrySet();
		for (Map.Entry<Long, String> it : s) {
			try {
				SimpleDateFormat obj = new SimpleDateFormat("MM-dd-yyyy");
				java.util.Date date1 = obj.parse(currentdate);
				java.util.Date date2 = obj.parse(it.getValue());
				long time_difference = date2.getTime() - date1.getTime();
				long years_difference = (time_difference / (1000l * 60 * 60 * 24 * 365));
				if (years_difference > 18)
					arl.add(it.getKey());
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return arl;

	}

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("Total number of people");
		int p = sc.nextInt();
		HashMap<Long, String> map = new HashMap<>();
		int up =9999999;
		Random rand =new Random();
		//creating databse of voters
		for (int i = 0; i < p; i++) {
			System.out.println("enter date of birth in dd-mm-yyyy  format");
			long rd = rand.nextInt(up);
			System.out.println(rd);
			
			String sDate1=sc.nextLine(); 
			map.put(rd, sDate1);

		}
		Exercise6 e = new Exercise6();
		System.out.println(e.votersList(map));
	}

}
}}}
