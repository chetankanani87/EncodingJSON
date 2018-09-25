package JSON_Examples;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ListExample {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("One");
		arrayList.add("Two");
		arrayList.add("Three");
		arrayList.add("Four");
		System.out.println(arrayList);

		List<String> linkedList = new LinkedList<String>();
		linkedList.add("Five");
		linkedList.add("Six");
		linkedList.add("Seven");
		linkedList.add("Eight");
		System.out.println(linkedList);

		List<Number> linkedNumbers = new LinkedList<>();
		linkedNumbers.add(new Integer(123));
		linkedNumbers.add(new Float(3.1415));
		linkedNumbers.add(new Double(299.988));
		linkedNumbers.add(new Long(67000));
		System.out.println(linkedNumbers);

		// initialization of our map
		HashMap<String, String> student = new HashMap<>();

		// adding elements to our hashmap
		student.put("age", "32");
		student.put("gender", "male");
		student.put("name", "Ryan");
		student.put("birthday", "May 12, 1982");

		// getting the contents of our hashmap
		System.out.println("Name: " + student.get("name"));
		System.out.println("Name: " + student.get("age"));
		System.out.println("Name: " + student.get("gender"));
		System.out.println("Name: " + student.get("birthday"));

		List<String> cities = Arrays.asList("Milan", "london", "San Francisco", "Tokyo", "New Delhi");
		System.out.println(cities);
		//[Milan, london, San Francisco, Tokyo, New Delhi]

		cities.sort(String.CASE_INSENSITIVE_ORDER);
		System.out.println(cities);
		//[london, Milan, New Delhi, San Francisco, Tokyo]

		cities.sort(Comparator.reverseOrder());
		System.out.println(cities);
		//[Milan, New Delhi, San Francisco, Tokyo, london]
		
		JSONObject obj = new JSONObject();
		obj.put("Name", "crunchify.com");
		obj.put("Author", "App Shah");
 
		JSONArray company = new JSONArray();
		company.add("Compnay: eBay");
		company.add("Compnay: Paypal");
		company.add("Compnay: Google");
		obj.put("Company List", company);
 
		// try-with-resources statement based on post comment below :)
		FileWriter file = new FileWriter("file1.json");
		try{
			file.write(obj.toJSONString());
			System.out.println("Successfully Copied JSON Object to File...");
			System.out.println("\nJSON Object: " + obj);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			file.flush();
			file.close();
		}
	}
}
