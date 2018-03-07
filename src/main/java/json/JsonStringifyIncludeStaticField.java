package json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *  refer https://stackoverflow.com/questions/14644860/why-static-fields-not-serialized-using-google-gson-gsonbuilder-json-parser
 * @author linuxea
 * @date 2018/3/7
 */
public class JsonStringifyIncludeStaticField {
	
	public static void main(String[] args) {
		
		ResponseStatus responseStatus = new ResponseStatus();
		
		Gson gson = new Gson();
		String s = gson.toJson(responseStatus);
		System.out.println(s);
		
		
		GsonBuilder gsonBuilder = new GsonBuilder();
		
		// Allowing the serialization of static fields
		gsonBuilder.excludeFieldsWithModifiers(java.lang.reflect.Modifier.TRANSIENT);
		// Creates a Gson instance based on the current configuration
		Gson gsonIncludeStatic = gsonBuilder.create();
		String json = gsonIncludeStatic.toJson(responseStatus);
		System.out.println(json);
		
	}
	
	private static class ResponseStatus {
		
		public static final String go = "let's go";
		public final int score = 1234;
	}
	
}
