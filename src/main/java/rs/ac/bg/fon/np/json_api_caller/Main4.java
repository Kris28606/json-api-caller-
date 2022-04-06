package rs.ac.bg.fon.np.json_api_caller;

import java.io.FileWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Main4 {

	public static void main(String[] args) {
		
		try(FileWriter writer=new FileWriter("rucni_upis.json")) {
			
			JsonObject obj = new JsonObject();
			
			obj.addProperty("city", "Lima");
			obj.addProperty("country", "Peru");
			obj.addProperty("region", "Središnji deo Perua");
			obj.addProperty("temperature", 25);
			obj.addProperty("weatherDescription", "Sunčano");
			obj.addProperty("windSpeed", 18);
			obj.addProperty("isDay", "yes");
			
			Gson gson=new GsonBuilder().setPrettyPrinting().create();
			
			gson.toJson(obj, writer);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
