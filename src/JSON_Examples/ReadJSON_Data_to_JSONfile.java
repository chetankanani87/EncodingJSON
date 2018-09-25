package JSON_Examples;

/* Note : In JSON, An object is an unordered set of name/value pairs, so JSONObject doesn’t preserve
 * the order of an object’s name/value pairs, since it is (by definition) not significant. Hence in our
 * output file, order is not preserved.
 */

import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

//Java program to read data form a JSON file
public class ReadJSON_Data_to_JSONfile {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws Exception  
    { 
        // parsing file "JSONExample.json" 
        Object obj = new JSONParser().parse(new FileReader("JSONExample.json")); 
          
        // type casting obj to JSONObject 
        JSONObject jo = (JSONObject) obj; 
          
        // getting firstName and lastName 
        String firstName = (String) jo.get("firstName"); 
        String lastName = (String) jo.get("lastName"); 
          
        System.out.println(firstName); 
        System.out.println(lastName); 
          
        // getting age 
        long age = (long) jo.get("age"); 
        System.out.println(age); 
          
        // getting address using Map object 
        Map addressMap = (Map)jo.get("address"); 
          
        // iterating address Map 
        Iterator<Map.Entry> itr1 = addressMap.entrySet().iterator(); 
        
        while (itr1.hasNext()) { 
            Map.Entry pair = itr1.next();
            System.out.println(pair.getKey() + " : " + pair.getValue()); 
        } 
          
        // getting phoneNumbers using JSONArray object
        JSONArray ja = (JSONArray) jo.get("phoneNumbers"); 
          
        // iterating phoneNumbers 
        Iterator itr2 = ja.iterator(); 
          
        while (itr2.hasNext())  
        { 
            itr1 = ((Map) itr2.next()).entrySet().iterator(); 
            while (itr1.hasNext()) { 
                Map.Entry pair = itr1.next(); 
                System.out.println(pair.getKey() + " : " + pair.getValue()); 
            } 
        } 
    }
}
