import java.net.*;
import java.util.Iterator;
import java.io.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main {

	public static void main(String[] args) throws MalformedURLException {
	
		
		String url = "https://api.typeform.com/v1/form/nFvEEC?key=da3c6ce66773ba0586d9dd68cfe383182ebcd2f7";
		
		StringBuilder result = new StringBuilder();
		URL typeFormURL = new URL(url);
		
		try {
			HttpURLConnection urlConnection = (HttpURLConnection) typeFormURL.openConnection();
			urlConnection.setRequestMethod("GET");
			
			BufferedReader buffReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			
			String input;
			
			while((input = buffReader.readLine()) != null) {
				result.append(input);
			}
			buffReader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jsonResult = result.toString();
		
		
		JSONParser parser = new JSONParser();
		try {
			JSONObject json = (JSONObject) parser.parse(jsonResult);
			
			
			String val = json.get("responses").toString();
			System.out.println(val);
			
			JSONArray red =  (JSONArray ) parser.parse(val);
			
			
			String val22 = red.get(0).toString();
			
			JSONObject thing = (JSONObject)parser.parse(val22);
			JSONObject answers = (JSONObject) thing.get("answers");
			
			val22 = answers.toString();
			
			
			System.out.println(val22);
			
		
			
		} catch (ParseException e) {
			e.printStackTrace();
		}

		

	}

}
