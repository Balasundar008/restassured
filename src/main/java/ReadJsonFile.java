import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJsonFile {

	public static void main(String[] args) throws IOException, ParseException {
		JSONParser jp= new JSONParser();
		FileReader fr= new FileReader("Bala.json");
		Object po = jp.parse(fr);
		JSONObject jo= (JSONObject) po;
		
		Object name = (String)jo.get("Name");
		Object age = jo.get("Age");
		
		JSONArray a= (JSONArray)jo.get("me and dad");
		
		Iterator i = a.iterator();
		System.out.println("Name is: "+ name);
		
		System.out.println("Age is:"+age);
		
		while (i.hasNext()) {
			System.out.println("me and dad:"+i.next());
		}
	
	}

}
