package JSON_Examples;

import java.io.IOException;
import java.io.StringWriter;

import org.json.simple.JSONObject;

//Following is another example that shows a JSON object streaming using Java JSONObject

public class EncodingJSON2 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {

		JSONObject obj = new JSONObject();

		obj.put("name", "foo");
		obj.put("num", new Integer(100));
		obj.put("balance", new Double(1000.21));
		obj.put("is_vip", new Boolean(true));

		StringWriter out = new StringWriter();
		obj.writeJSONString(out);

		System.out.print(out.toString() + "\n");
	}
}
