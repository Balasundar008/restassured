package RestAssuredBDD;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJsonFile {
public static void main(String[] args) throws IOException {

	JSONObject jo= new JSONObject();
	jo.put("Name", "Bala");
	jo.put("Age", 18);
	
	JSONArray ja= new JSONArray();
	ja.add("balasundar");
	ja.add("mahendran");
	
	jo.put("me and dad", ja);
	
	FileWriter fw= new FileWriter("Bala.json");
	fw.write(jo.toString());
	fw.close();
	
}
}
