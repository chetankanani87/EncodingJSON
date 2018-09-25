package JSON_Examples;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;

//Following is another example that shows a JSON object streaming using Java JSONObject

public class EncodingJSON3 {
	public static void main(String[] args) {

		Map<Object, Object> dataMap = new HashMap<Object, Object>();

		dataMap.put("name", "Aparajita");
		dataMap.put("age", new Integer(25));
		dataMap.put("Salary", new Double(5000.99));
		dataMap.put("employed", new Boolean(true));
		dataMap.put("job", "Freelancing");

		JSONObject jsonObj = new JSONObject(dataMap);
		System.out.print("Encoding from JAVA to JSON: ");
		System.out.print(jsonObj);
		System.out.println();
	}
}
