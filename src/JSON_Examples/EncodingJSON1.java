package JSON_Examples;

/* Encoding JSON in Java -
 * Following is a simple example to encode a JSON object using Java JSONObject 
 * which is a subclass of java.util.HashMap. No ordering is provided. If you need
 * the strict ordering of elements, use JSONValue.toJSONString ( map ) method with
 * ordered map implementation such as java.util.LinkedHashMap
 */
import org.json.simple.JSONObject;

public class EncodingJSON1 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		JSONObject obj = new JSONObject();

		obj.put("name", "foo");
		obj.put("num", new Integer(100));
		obj.put("balance", new Double(1000.21));
		obj.put("is_vip", new Boolean(true));

		System.out.print(obj + "\n");
	}
}